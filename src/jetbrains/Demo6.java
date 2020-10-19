package jetbrains;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        while (num != 1) {
            System.out.print(num + " ");
            if (isEven(num)) {
                num /= 2;
                continue;
            }
            num = num * 3 + 1;
        }
        System.out.print(num);
    }

    protected static boolean isEven(int num) {
        return num % 2 == 0 ? true : false;
    }
}
/**
 * Collatz conjecture
 * Given natural number n. Generate a sequence of integers, described in the Collatz conjecture:
 *
 * If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1. Repeat this operation until we get the number 1 as a result.
 *
 * For example, if the number n = 17, then the sequence looks as the following:
 * 17 52 26 13 40 20 10 5 16 8 4 2 1
 * Such a sequence will stop at number 1 for any primary natural number n.
 *
 * Output format:
 * Sequence of integers in a single line, separated by spaces.
 *
 *
 * Sample Input:
 * 17
 *
 * Sample Output:
 * 17 52 26 13 40 20 10 5 16 8 4 2 1
 *
 *
 * Sample Input:
 * 1
 *
 * Sample Output:
 * 1
 */
