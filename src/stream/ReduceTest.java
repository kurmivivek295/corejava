package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ReduceTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 20, 30);
		
		Integer r1 = numbers.stream().reduce(0, Integer::max);
		System.out.println(r1);

		Integer r2 = numbers.stream().reduce(0, Integer::sum);
		System.out.println(r2);

		Consumer<Integer> printNumber = System.out::println;
		
		Optional<Integer> r4 = numbers.stream().reduce(Integer::sum);
		r4.ifPresent(printNumber);
		
	}
	
}
