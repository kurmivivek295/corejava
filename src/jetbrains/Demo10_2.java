package jetbrains;

import java.util.Scanner;

public class Demo10_2 {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        scanner.nextLine();

        int currCounter = 0;
        int maxCounter = 0;
        int currNum;
        int prevNum = Integer.MIN_VALUE;
        for (int i = 0; i < sizeArray; i++) {

            currNum = scanner.nextInt();
            if (currNum > prevNum) {
                currCounter++;
            } else {
                if (maxCounter < currCounter) {
                    maxCounter = currCounter;
                }
                currCounter = 1;
            }
            prevNum = currNum;
        }
        if (maxCounter < currCounter) {
            maxCounter = currCounter;
        }
        System.out.println(maxCounter);

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
