package lambda;

import java.util.function.BiConsumer;
import java.util.function.UnaryOperator;

public class LambdaDemo5 {

	public static void main(String[] args) {
		Tranformer tranformer = (String name) -> name.toUpperCase();

		UnaryOperator<String> transformer1 = name -> name.toLowerCase();
		
		System.out.println(transformer1.apply("VIVEK"));
		
		BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + " " + s2);
		
		biConsumer.accept("Vivek", "Kurmi");
	}

}
