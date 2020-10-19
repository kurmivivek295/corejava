package jetbrains;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int sqrt = 0, i = 1;

        while (true) {
            sqrt = i * i;
            if (sqrt > num) {
                break;
            }
            System.out.println(sqrt);
            i++;
        }
    }
}
/**
 * Squares of natural numbers
 * Read an integer number N from the input and print all the squares of natural numbers:
 *
 * less than or equal to N,
 * in ascending order.
 *
 * Sample Input:
 * 50
 *
 * Sample Output:
 * 1
 * 4
 * 9
 * 16
 * 25
 * 36
 * 49
 *
 * Sample Input:
 * 1
 *
 * Sample Output:
 * 1
 */
