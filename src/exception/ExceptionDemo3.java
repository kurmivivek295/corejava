package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo3 {

	public static void divide(int a, int b) throws ArithmeticException {
		System.out.println(a/b);
		System.out.println("Divide is done");			
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			divide(a, b);			
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally Block");
		} 
	}
}
