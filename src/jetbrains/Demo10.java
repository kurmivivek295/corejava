package jetbrains;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int count = 1;
        int latCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++, i++) {
                if (arr[i] > arr[j]) {
                    break;
                }
                count++;
            }
            if (count > latCount) {
                latCount = count;
            }
            count = 1;
        }
        System.out.println(latCount == 0 ? 1 : latCount);
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
