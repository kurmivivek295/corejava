package dp.singleton;

import java.util.concurrent.TimeUnit;

public class SingletonDemo1 {

    private static SingletonDemo1 instance = null;
    private static boolean flag = true;
    private SingletonDemo1() {}

    public static SingletonDemo1 getInstance() {
        if (instance == null) {

            // trying to fail the singleton
            if (flag) {
                flag = false;
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            instance = new SingletonDemo1();
        }
        return instance;
    }
}