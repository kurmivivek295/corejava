package advanced_threading.demo1;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = () -> "In thread: " + Thread.currentThread().getName();
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 50; i++) {
            Future<String> future = executorService.submit(callable);
            System.out.println(future.get());
        }

        executorService.shutdown();
    }

}
