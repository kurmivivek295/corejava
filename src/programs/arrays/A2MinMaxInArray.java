package programs.arrays;

public class A2MinMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {-1, 7, 8, 0, 1, 2, 5, 6, 3, 4, 8, 5, 9};

        int min = 0, max = 0;

        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] > max) {
               max = numbers[i];
           } else if (numbers[i] < min) {
               min = numbers[i];
           }
        }

        System.out.println("Min: " + min + " Max: " + max);

    }
}
