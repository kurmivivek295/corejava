package advanced_threading.barrier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class BarrierInAction {

    static class Friends implements Callable<String> {
        private CyclicBarrier barrier;
        Friends(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public String call() throws Exception {
            Random random = new Random();
            Thread.sleep(random.nextInt(20)*100 + 100);
            System.out.println("I have reached at cafe and waiting for others");

            barrier.await();

            System.out.println("Let's go to cinema");

            return "OK";
        }
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(4);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, ()-> System.out.println("Barrier Opening"));

        List<Future<String>> futures = new ArrayList<>();

        try {
            for (int i = 0; i < 4; i++) {
                futures.add(service.submit(new Friends(cyclicBarrier)));
            }

            futures.forEach(future -> {
                try {
                    future.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            });
        } finally {
            service.shutdown();
        }
    }

}
