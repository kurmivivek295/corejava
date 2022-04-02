package programs.sorting;

import java.util.stream.IntStream;

public class S1BubbleSort1 {
    public static void main(String[] args) {
        int[] numbers = {-1, 7, 8, 0, 1, 2, 5, 6, 3, 4, 8, 5, 9, 1};

        numbers = sortArray(numbers);

        IntStream.of(numbers).forEach(
                System.out::print
        );
    }

    private static int[] sortArray(int[] numbers) {
        int temp;
        boolean swapped = Boolean.TRUE;
        for (int i = 0; i < numbers.length && swapped; i++) {
            swapped = Boolean.FALSE;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swapped = Boolean.TRUE;
                }
            }
        }

        return numbers;
    }
}
