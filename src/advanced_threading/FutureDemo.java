package advanced_threading;

import java.util.concurrent.*;

public class FutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<String> callable = () -> {
            return threadSleep();
        };

        Long startTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " : Start time: " + startTime);

        ExecutorService pool = Executors.newFixedThreadPool(3);

        Future f1 = pool.submit(callable);
        Future f2 = pool.submit(callable);
        Future f3 = pool.submit(callable);
        Future f4 = pool.submit(callable);
        Future f5 = pool.submit(callable);
        Future f6 = pool.submit(callable);

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
        System.out.println(f5.get());
        System.out.println(f6.get());

        pool.shutdown();

        Long endTime = System.currentTimeMillis();;
        System.out.println(Thread.currentThread().getName() + " : End time: " + endTime);
        System.out.println(Thread.currentThread().getName() + " : Execution time: " + (endTime - startTime));

        System.out.println("Hello after thread");

    }

    public static String threadSleep() throws InterruptedException {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }
}
