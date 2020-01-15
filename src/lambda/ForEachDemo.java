package lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("C", "Java", "Python", "Net");
		
		nameList.forEach(System.out::println);
		
	}

}
