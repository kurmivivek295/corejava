package programs.arrays;

/**
 * Recursive way to find min and max in an array
 * Divide and conquer approach
 */
public class A2MinMaxInArray1 {

    static class MinMax {
        int min;
        int max;
    }



    public static void main(String[] args) {
        int[] numbers = {1000, 11, 445, 1, 330, 3000};

        MinMax minMax = findMinMax(numbers, 0, numbers.length - 1);

        System.out.println("Min: " + minMax.min + " Max: " + minMax.max);

    }

    private static MinMax findMinMax(int[] numbers, int low, int high) {
        MinMax minMax = new MinMax();
        MinMax minMaxL = new MinMax();
        MinMax minMaxR = new MinMax();

        int mid;

        if (low == high) {
            minMax.min = numbers[low];
            minMax.max = numbers[low];
            return minMax;
        }

        if (high == low + 1) {
            if (numbers[low] < numbers[high]) {
                minMax.min = numbers[low];
                minMax.max = numbers[high];
            } else {
                minMax.min = numbers[high];
                minMax.max = numbers[low];
            }
            return minMax;
        }

        mid = (low + high) / 2;
        minMaxL = findMinMax(numbers, low, mid);
        minMaxR = findMinMax(numbers, mid + 1, high);

        if (minMaxL.min < minMaxR.min) {
            minMax.min = minMaxL.min;
        } else {
            minMax.min = minMaxR.min;
        }
        if (minMaxL.max > minMaxR.max) {
            minMax.max = minMaxL.max;
        } else {
            minMax.max = minMaxR.max;
        }

        return minMax;
    }
}
