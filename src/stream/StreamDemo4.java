package stream;

import java.util.stream.Stream;

public class StreamDemo4 {

	public static void main(String[] args) {

		Stream.of(1, 2, 3, 4, 5, 6, 2, 4, 6)
				.distinct().forEach(System.out::println);

		// Same output
		Stream.of("1", "2", "3", "4", "5", "6", "2", "4", "6")
				.distinct().forEach(System.out::println);
	}

}
