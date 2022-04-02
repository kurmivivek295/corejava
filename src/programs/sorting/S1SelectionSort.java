package programs.sorting;

import java.util.stream.IntStream;

public class S1SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {-1, 7, 8, 0, 1, 2, 5, 6, 3, 4, 8, 5, 9};

        numbers = sortArray(numbers);

        IntStream.of(numbers).forEach(
                System.out::print
        );
    }

    private static int[] sortArray(int[] numbers) {
        int temp, min;

        for (int i = 0; i < numbers.length; i++) {
            min = i;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
        return numbers;
    }
}
