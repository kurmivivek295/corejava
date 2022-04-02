package programs.sorting;

public class S1BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {-1, 7, 8, 0, 1, 2, 5, 6, 3, 4, 8, 5, 9};

        numbers = sortArray(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    private static int[] sortArray(int[] numbers) {
        int temp;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        return numbers;
    }
}
