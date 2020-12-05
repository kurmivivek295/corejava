package collections;

import java.io.IOException;

abstract class A {
    public A a() throws RuntimeException {throw new RuntimeException();}

    @Override
    public String toString() {
        return "A class";
    }
}
class B extends A{
    public B a() {return new B();}

    @Override
    public String toString() {
        return "B class";
    }
}

public class Demo1 {

    public static void main(String[] args) {

//        B b = (B)new A(); RUntime Excetpion
        A a = new B();
        a.a();
        System.out.print("Hello! Guys");

        int n = 2000;
        byte num = (byte) n;
        System.out.println(num);
    }

}
