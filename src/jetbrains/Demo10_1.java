package jetbrains;

import java.util.Scanner;

public class Demo10_1 {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        int count = 1;
        int countMax = 1;
        for (int j = 0; j < size - 1; j++) {
            if (array[j] <= array[j + 1]) {
                count++;
                if (count > countMax) {
                    countMax = count;
                }
            } else if (array[j] > array[j + 1]) {
                count = 1;
            }
        }
        System.out.println(countMax);
    }
}
/**
 *The longest ascending sequence
 * Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. Elements of the sequence must go one after another. A single number is assumed to be ordered sequence with the length = 1.
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 *
 * Example
 *
 * The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5. It includes the following elements: 1 2 3 5 7.
 *
 *
 * Sample Input:
 * 10
 * 1 2 4 1 2 3 5 7 4 3
 *
 * Sample Output:
 * 5
 */
