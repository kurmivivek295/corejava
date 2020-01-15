package lambda;

public class LambdaDemo1 {
	
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 0");
			}
		};
		
//		Runnable runnable = () -> System.out.println("Thread 1");
		
		new Thread(runnable);
		
	}

}
