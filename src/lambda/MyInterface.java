package lambda;

interface MyInterface {
    default void defaultMethod(){
        System.out.println("Default");
    }

    static void staticMethod(){
        System.out.println("Static");
    }
}
