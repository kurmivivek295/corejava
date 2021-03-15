package advanced_threading.demo1;

import java.util.concurrent.*;

// Demo with get timed with exception handling
public class CallableDemo2 {
    public static void main(String[] args) {
        Callable<String> callable = () -> {
            TimeUnit.SECONDS.sleep(2);
            return "In thread: " + Thread.currentThread().getName();
        };
        ExecutorService service = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 50; i++) {
            try {
                System.out.println(service.submit(callable).get(1, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            } finally {
                service.shutdown();
            }
        }

    }
}
