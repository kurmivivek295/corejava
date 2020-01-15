package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo2 {
	
	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("C", "Java", "Python", "Net");
		
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};

//		Comparator<String> c = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
		
		Collections.sort(nameList, c);
		
		nameList.forEach(System.out::println);
		
	}

}
