package dp.singleton;

import java.util.concurrent.TimeUnit;

public class SingletonDemo3 {

    private static SingletonDemo3 instance = null;
    private static Object lock = new Object();
    private static boolean flag = true;
    private SingletonDemo3() {}

    public static SingletonDemo3 getInstance() {
        synchronized (lock) {
            if (instance == null) {
                // trying to fail the singleton
                if (flag) {
                    flag = false;
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                instance = new SingletonDemo3();
            }
        }
        return instance;
    }
}