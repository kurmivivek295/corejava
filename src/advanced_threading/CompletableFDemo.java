package advanced_threading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFDemo {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            try {
                System.out.println(Thread.currentThread().getName());
                threadSleep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(3);

        CompletableFuture<Void> one = CompletableFuture.runAsync(runnable, pool);
        CompletableFuture<Void> two = CompletableFuture.runAsync(runnable, pool);
        CompletableFuture<Void> three = CompletableFuture.runAsync(runnable, pool);

//        CompletableFuture.allOf(one, two, three).join();

        pool.shutdown();

    }

    public static void threadSleep() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
    }
}
