package interview.methodoverriding;

class A {
    protected A m1() throws Exception {
        return new A();
    }
}

public class B extends A {

    @Override
    public B m1() throws RuntimeException {
        return new B();
    }

}
