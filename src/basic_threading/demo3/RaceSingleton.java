package basic_threading.demo3;

import java.util.concurrent.TimeUnit;

public class RaceSingleton {

    private static RaceSingleton singleton;

    private RaceSingleton(){}

    public static RaceSingleton getSingleton() throws InterruptedException {
        if (singleton == null) {
            TimeUnit.SECONDS.sleep(5);
            singleton = new RaceSingleton();
        }
        return singleton;
    }
}
