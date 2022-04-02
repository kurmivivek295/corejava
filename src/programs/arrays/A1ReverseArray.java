package programs.arrays;

/**
 * Reverse the array
 */
public class A1ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Just print the reverse
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
        }

        System.out.println();

        long startTime, endTime;

        startTime = System.nanoTime();
        // Actually reverse the array elements
        int length = numbers.length - 1;
        int temp;
        for (int i = 0, j = length; i <= length/2 && j >= length/2; i++, j--) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        endTime = System.nanoTime();
        System.out.println("\n1st approach time taken: " + (endTime - startTime));

        // Other way actual reverse
        startTime = System.nanoTime();
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        endTime = System.nanoTime();
        System.out.println("\n2nd approach time taken: " + (endTime - startTime));

        // Reverse with recursion
        startTime = System.nanoTime();
        int[] reversedArray = reverseArray(numbers, 0, numbers.length - 1);
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i]);
        }
        endTime = System.nanoTime();
        System.out.println("\n3rd approach time taken: " + (endTime - startTime));
    }

    private static int[] reverseArray(int[] numbers, int start, int end) {
        if (start >= end) {
            return numbers;
        }

        int temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;

        return reverseArray(numbers, start + 1, end - 1);
    }
}


