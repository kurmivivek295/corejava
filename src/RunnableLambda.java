import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunnableLambda {
	
	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			System.out.println(Thread.currentThread().getName());
		};
		
		Thread th = new Thread(runnable);
		th.start();
		
/*		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable");
			}
		};
		Thread th = new Thread(runnable);
		th.start();
*/	
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};
		
		Comparator<String> comp = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
		
		List<String> nameList = Arrays.asList("C", "Java", "Python", "Net");
		nameList.forEach(System.out::println);
		
		Collections.sort(nameList, c);
		
		nameList.forEach(System.out::println);
	
	}

}
