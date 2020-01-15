package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		Function<String, Integer> converter = Integer::parseInt;
		System.out.println(converter.apply("123"));
		
		Consumer<String> print = System.out::println;
		print.accept("Vivek");
		
		Supplier<List<String>> listOfString = ArrayList::new;
		listOfString.get().add("Vivek");
		
		listOfString.get().forEach(System.out::println);
		
	}

}
