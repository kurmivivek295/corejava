package oops;

public interface Interface1 {
    void m1();

    default int m2() {
        System.out.println("interface 1");
        return 1;
    }

    static void m3() {

    }
}
interface Interface2 extends Interface1 {
    void m1();

    default int m2() {
        System.out.println("interface 2");
        return 2;
    }
    static void m3() {

    }
}

class Impl implements Interface1, Interface2 {
    public static void main(String[] args) {
        Interface1 impl = new Impl();
        impl.m2();
        impl.m1();
    }

    @Override
    public void m1() {
        System.out.println("Impl");
    }

    static void m3()  {

    }
}