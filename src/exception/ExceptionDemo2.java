package exception;

public class ExceptionDemo2 {

	public static void divide(int a, int b) {
		try {
			System.out.println(a/b);
			System.out.println("Divide is done");			
		} catch (ArithmeticException ae) {
			System.out.println("Value of b is either ZERO or Invalid");
		}
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		divide(a, b);
	}
}
