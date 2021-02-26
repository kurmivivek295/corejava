package dp.singleton.test;

import dp.singleton.SingletonDemo1;
import dp.singleton.SingletonDemo2;
import dp.singleton.SingletonDemo3;
import dp.singleton.SingletonDemo4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public class SingletonDemoTest {

    @Test
    public void getInstanceTest() {
        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        SingletonDemo1 s2 = SingletonDemo1.getInstance();

        Assertions.assertEquals(s1.hashCode(), s2.hashCode());
    }

    @Test
//    Failing when we use threading
    public void getInstanceTest_thread_fail() throws InterruptedException {
        AtomicReference<SingletonDemo1> s1 = new AtomicReference<>();
        AtomicReference<SingletonDemo1> s2 = new AtomicReference<>();

        Thread t1 = new Thread(() -> s2.set(SingletonDemo1.getInstance()));
        Thread t2 = new Thread(() -> s1.set(SingletonDemo1.getInstance()));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Assertions.assertNotEquals(s1.get().hashCode(), s2.get().hashCode());
    }

    @Test
//    Failing when we use threading
    public void getInstanceTest_thread_usingVolatile() throws InterruptedException {
        AtomicReference<SingletonDemo2> s1 = new AtomicReference<>();
        AtomicReference<SingletonDemo2> s2 = new AtomicReference<>();

        Thread t1 = new Thread(() -> s1.set(SingletonDemo2.getInstance()));
        Thread t2 = new Thread(() -> s2.set(SingletonDemo2.getInstance()));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Assertions.assertNotEquals(s1.get().hashCode(), s2.get().hashCode());
    }

    @Test
    public void getInstanceTest_thread_usingSynchronization() throws InterruptedException {
        AtomicReference<SingletonDemo3> s1 = new AtomicReference<>();
        AtomicReference<SingletonDemo3> s2 = new AtomicReference<>();

        Thread t1 = new Thread(() -> s1.set(SingletonDemo3.getInstance()));
        Thread t2 = new Thread(() -> s2.set(SingletonDemo3.getInstance()));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Assertions.assertEquals(s1.get().hashCode(), s2.get().hashCode());
    }

    @Test
    public void getInstanceTest_thread_usingReflection() throws InterruptedException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonDemo3 s1 = SingletonDemo3.getInstance();
        Constructor<SingletonDemo3>[] constructors = (Constructor<SingletonDemo3>[]) SingletonDemo3.class.getDeclaredConstructors();
        constructors[0].setAccessible(true);
        SingletonDemo3 s2 = constructors[0].newInstance();

        Assertions.assertNotEquals(s1.hashCode(), s2.hashCode());
    }

    @Test
    public void getInstanceTest_thread_usingReflection_throwsException() throws InterruptedException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonDemo4.getInstance();
        Constructor<SingletonDemo4>[] constructors = (Constructor<SingletonDemo4>[]) SingletonDemo4.class.getDeclaredConstructors();
        constructors[0].setAccessible(true);
//        SingletonDemo3 s2 = constructors[0].newInstance();

        Assertions.assertThrows(InvocationTargetException.class, () -> constructors[0].newInstance());
    }

}