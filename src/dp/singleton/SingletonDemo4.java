package dp.singleton;

import java.util.concurrent.TimeUnit;

public class SingletonDemo4 {

    private static SingletonDemo4 instance = null;
    private static Object lock = new Object();
    private static boolean flag = true;
    private SingletonDemo4() {
        if (instance != null) {
            throw new RuntimeException("Instace is already created");
        }
    }

    public static SingletonDemo4 getInstance() {
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
                instance = new SingletonDemo4();
            }
        }
        return instance;
    }
}