package advanced_threading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockDemo {

    private static LockDemo lockDemo;
    private static Lock lock = new ReentrantLock();

    private LockDemo(){}

    public static LockDemo getInstance() {
        if (lockDemo == null) {
            try {
                lock.lock();
                lockDemo = new LockDemo();
            } finally {
                lock.unlock();
            }
        }
        return lockDemo;
    }
}

public class LockDemoSingleton {
    public static void main(String[] args) {
        LockDemo lockDemo = LockDemo.getInstance();
    }
}
