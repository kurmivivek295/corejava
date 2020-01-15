package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NewPatternsDemo {

	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("C", "Java", "Python", "Net");

		List<String> result = new ArrayList<>();
		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = result::add;
		
		nameList.forEach(c1.andThen(c2));
		System.out.println("size of result: " + result.size());
	}

}
