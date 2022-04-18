package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamDemo6 {

	public static void main(String[] args) {

		Function<String, String[]> splitFun = str -> str.split("");

		Stream.of("Hello", "World")
				.map(splitFun)
				.flatMap(Arrays::stream)
				.distinct()
				.forEach(System.out::print);

		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		List<int[]> pairs =
				numbers1.stream()
						.flatMap(i -> numbers2.stream()
								.map(j -> new int[]{i, j})
						)
						.collect(toList());

		pairs.stream().map(Arrays::toString).forEach(System.out::println);
	}

}
