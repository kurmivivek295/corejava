package programs.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S2PairOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(1, 2, 3);

        List<int[]> pairs = numbers1.stream().flatMap(i -> numbers2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());

        for (int[] anInt : pairs) {
            for (int n: anInt)
                System.out.println(n);
        }
    }
}
