package lambda;

import lambda.MyInterface;

public class DefaultStaticDemo implements MyInterface {

	public static void main(String[] args) {
//		DefaultStaticDemo.staticMethod();
		MyInterface.staticMethod();
		DefaultStaticDemo defaultStaticDemo = new DefaultStaticDemo();
		defaultStaticDemo.defaultMethod();
	}
	
	@Override
	public void defaultMethod() {
        System.out.println("Default");
    }

}
