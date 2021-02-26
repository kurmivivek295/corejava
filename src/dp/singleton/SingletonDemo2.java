package dp.singleton;

import java.util.concurrent.TimeUnit;

public class SingletonDemo2 {

    private static volatile SingletonDemo2 instance = null;
    private static boolean flag = true;
    private SingletonDemo2() {}

    public static SingletonDemo2 getInstance() {
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
            instance = new SingletonDemo2();
        }
        return instance;
    }
}