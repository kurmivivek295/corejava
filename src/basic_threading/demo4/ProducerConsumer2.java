package basic_threading.demo4;

public class ProducerConsumer2 {

    private static Object lock = new Object();
    private static int[] buffer;
    private static int counter;

    static class Producer {
        void produce() {
            synchronized (lock) {
                if (!isFull(buffer)) {
                    buffer[counter++] = 1;
                }
                System.out.println("Done producing");
            }
        }
    }

    static class Consumer {
        void consume() {
            synchronized (lock) {
                if (!isEmpty(buffer)) {
                    buffer[--counter] = 0;
                }
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
        };

        Runnable consumer = () -> {
            Consumer c = new Consumer();
            for (int i = 0; i < 50; i++) {
                c.consume();
            }
        };

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Buffer data count: " + counter);
    }
}
