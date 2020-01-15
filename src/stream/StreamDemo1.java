package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("C", "Java", "Java", "Python", "Net");
		
		List<String> list = nameList.stream().filter(s -> s.length() > 2) 
						.distinct()
						.limit(2)
//						.skip(1)
						.collect(Collectors.toList());
		list.forEach(System.out::println);
	}

}
