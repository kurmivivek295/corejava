package jetbrains;

import java.util.Scanner;

/**
 *The sum of digits
 * Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.
 * Sample Input:
 * 476
 * Sample Output:
 * 17
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int left;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            left = num / 10;
            num = left;
        }
        System.out.println(sum);
    }
}