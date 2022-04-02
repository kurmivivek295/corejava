package programs.arrays;

public class A2MinMaxInArray2 {
    static class MinMax {
        int min;
        int max;
    }
    public static void main(String[] args) {
        int[] numbers = {-1, 7, 8, 0, 1, 2, 5, 6, 3, 4, 8, 5, 9};

        MinMax minMax = findMinMax(numbers);

        System.out.println("Min: " + minMax.min + " Max: " + minMax.max);

    }

    private static MinMax findMinMax(int[] numbers) {
        MinMax minMax = new MinMax();
        int length = numbers.length;

        if (length == 0) {
            return minMax;
        }

        minMax.min = numbers[0];
        minMax.max = numbers[0];

        for (int i = 1; i < length - 1; i+=2) {
            if (numbers[i] < numbers[i+1]) {
                if (numbers[i] < minMax.min) {
                    minMax.min = numbers[i];
                }
                if (numbers[i+1] > minMax.max) {
                    minMax.max = numbers[i+1];
                }
            } else {
                if (numbers[i] < minMax.min) {
                    minMax.min = numbers[i];
                }
                if (numbers[i+1] > minMax.max) {
                    minMax.max = numbers[i+1];
                }
            }
        }

        return minMax;
    }
}
