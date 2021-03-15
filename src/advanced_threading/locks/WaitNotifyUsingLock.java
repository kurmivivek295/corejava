package advanced_threading.locks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WaitNotifyUsingLock {

    private static int[] integerArr;
    private static int count;

    private static Lock lock = new ReentrantLock();
    private static Condition isEmpty = lock.newCondition();
    private static Condition isFull = lock.newCondition();

    static class Consumer {
        public static void consume() {
            try {
                lock.lock();
                if (isEmpty()) {
                    try {
                        isEmpty.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                integerArr[--count] = 0;
                if (isEmpty())
                    isFull.signal();
                System.out.println("Done Consuming");
            } finally {
                lock.unlock();
            }
        }
    }

    static class Producer {
        public static void produce() {
            try {
                lock.lock();
                if (isFull()) {
                    try {
                        isFull.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                integerArr[count++] = 1;
                if (isFull())
                    isEmpty.signal();
                System.out.println("Done producing");
            } finally {
                lock.unlock();
            }
        }
    }

    private static boolean isEmpty() {
        return integerArr.length == 0;
    }
    private static boolean isFull() {
        return integerArr.length == count;
    }

    public static void main(String[] args) throws InterruptedException {
        integerArr = new int[10];
        count = 0;
        Runnable r1 = () -> {
            for (int i = 0; i < 50; i++) {
                Producer.produce();
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 50; i++) {
                Consumer.consume();
            }
        };

//        ExecutorService service = Executors.newFixedThreadPool(2);
//        service.submit(r1);
//        service.submit(r2);
//
//        service.shutdownNow();
//
////        service.shutdown();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Item left" + count);
    }

}
