package stream.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 4, 7, 9, 6, 3);

        IntStream.range(0, list.size())
                .filter( n -> n%3 == 0)
                .mapToObj(list::get)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
