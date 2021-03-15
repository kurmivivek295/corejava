package advanced_threading.demo1;

import java.util.concurrent.*;

// Demo with get timed with executor not going down
public class CallableDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Callable<String> callable = () -> {
            TimeUnit.SECONDS.sleep(2);
            return "In thread: " + Thread.currentThread().getName();
        };
        ExecutorService service = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 50; i++) {
            System.out.println(service.submit(callable).get(1, TimeUnit.SECONDS));
        }

        // this line not be executed
        service.shutdown();
    }
}
