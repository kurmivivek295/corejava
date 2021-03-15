package basic_threading.demo3;

import java.util.concurrent.atomic.AtomicReference;

public class RaceSingletonTest {

    public static void main(String[] args) throws InterruptedException {
        AtomicReference<RaceSingleton> singleton1 = new AtomicReference<>();
        AtomicReference<RaceSingleton> singleton2 = new AtomicReference<>();
        Runnable r1 = () -> {
            try {
                singleton1.set(RaceSingleton.getSingleton());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable r2 = () -> {
            try {
                singleton2.set(RaceSingleton.getSingleton());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();

        t1.join();
        t2.join();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }

}
