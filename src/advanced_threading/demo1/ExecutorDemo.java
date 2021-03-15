package advanced_threading.demo1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {

    public static void main(String[] args) {

        Runnable r1 = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("R1 in: " + Thread.currentThread().getName());
        };

        Runnable r2 = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("R2 in: "  + Thread.currentThread().getName());
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(r1);
        executor.execute(r2);

        executor.shutdown();
    }

}
