package basic_threading.demo4;

/**
 * Non synchronized version
 */
public class ProducerConsumer1 {

    private static int[] buffer;
    private static int count;

    static class Producer {
        void produce() {
            if (!isFull(buffer)) {
                buffer[count++] = 1;
            }
        }
    }

    static class Consumer {
        void consume() {
            if (!isEmpty(buffer)) {
                buffer[count--] = 0;
            }
        }
    }

    static boolean isEmpty(int[] buffer) {
        return count == 0;
    }

    static boolean isFull(int[] buffer) {
        return count == buffer.length;
    }

    public static void main(String[] args) throws InterruptedException {
        buffer = new int[10];

        Runnable r1 = () -> {
            Producer producer = new Producer();
            for (int i = 0; i < 50; i++) {
                producer.produce();
            }
            System.out.println("Done producing");
        };

        Runnable r2 = () -> {
          Consumer consumer = new Consumer();
            for (int i = 0; i < 50; i++) {
                consumer.consume();
            }
            System.out.println("Done consuming");
        };

        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Buffer Data: " + count);
    }

}
