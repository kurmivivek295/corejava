package basic_threading.demo4;

public class

ProducerConsumer3 {

    private static Object lock = new Object();
    private static int[] buffer;
    private static int counter;

    static class Producer {
        void produce() {
            synchronized (lock) {
                if (isFull(buffer)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                buffer[counter++] = 1;
                lock.notify();
                System.out.println("Done producing");
            }
        }
    }

    static class Consumer {
        void consume() {
            synchronized (lock) {
                if (isEmpty(buffer)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                buffer[--counter] = 0;
                lock.notify();
                System.out.println("Done consuming");
            }
        }
    }

    private static boolean isFull(int[] buffer) {
        return counter == buffer.length;
    }

    private static boolean isEmpty(int[] buffer) {
        return counter == 0;
    }

    public static void main(String[] args) throws InterruptedException {
        buffer = new int[10];

        Runnable producer = () -> {
            Producer p = new Producer();
            for (int i = 0; i < 50; i++) {
                p.produce();
            }
            System.out.println("Done producing");
        };

        Runnable consumer = () -> {
            Consumer c = new Consumer();
            for (int i = 0; i < 50; i++) {
                c.consume();
            }
            System.out.println("Done consuming");
        };

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        System.out.println("Before start Thread t1 state: " + t1.getState());
        System.out.println("Before start Thread t2 state: " + t2.getState());

        t1.start();
        t2.start();

        System.out.println("After start Thread t1 state: " + t1.getState());
        System.out.println("After start Thread t2 state: " + t2.getState());
        t1.join();
        t2.join();
        System.out.println("After Join Thread t1 state: " + t1.getState());
        System.out.println("After Join Thread t2 state: " + t2.getState());

        System.out.println("Buffer data count: " + counter);
    }
}
