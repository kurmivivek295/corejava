package exception;

public class CustomExceptionTest {
	public static void main(String[] args) {
		try {
			throw new CustomException("Custom Exception");
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}
}
