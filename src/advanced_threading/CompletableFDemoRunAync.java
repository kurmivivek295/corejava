package advanced_threading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFDemoRunAync {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            try {
                threadSleep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Long startTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " : Start time: " + startTime);

        ExecutorService pool = Executors.newFixedThreadPool(3);

        CompletableFuture<Void> one = CompletableFuture.runAsync(runnable, pool);
        CompletableFuture<Void> two = CompletableFuture.runAsync(runnable, pool);
        CompletableFuture<Void> three = CompletableFuture.runAsync(runnable, pool);

        CompletableFuture.allOf(one, two, three).join();

        pool.shutdown();

        Long endTime = System.currentTimeMillis();;
        System.out.println(Thread.currentThread().getName() + " : End time: " + endTime);
        System.out.println(Thread.currentThread().getName() + " : Execution time: " + (endTime - startTime));

        System.out.println("Hello after thread");

    }

    public static void threadSleep() throws InterruptedException {
        Thread.sleep(10000);
    }
}
