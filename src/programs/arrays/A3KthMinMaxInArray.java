package programs.arrays;

import java.util.Arrays;

public class A3KthMinMaxInArray {
    static class MinMax {
        int min;
        int max;
    }

    public static void main(String[] args) {
        int[] numbers = {-1, 7, 8, 0, 1, 2, 5, 6, 3, 4, 8, 5, 9};

        MinMax minMax = findKthMinMax(numbers, 8, 8);

        System.out.println("Min: " + minMax.min + " Max: " + minMax.max);

    }

    private static MinMax findKthMinMax(int[] numbers, int minIndex, int maxIndex) {
        MinMax minMax = new MinMax();

        if (minIndex > numbers.length || maxIndex > numbers.length) {
            return minMax;
        }

        Arrays.sort(numbers);

        minMax.min = numbers[minIndex - 1];
        minMax.max = numbers[numbers.length - maxIndex > 0 ? numbers.length - maxIndex : 0];
        return minMax;
    }
}
