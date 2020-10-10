package jetbrains;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNext()) {
            int temp = scanner.nextInt();

            sum += temp;

            if (temp == 0) {
                break;
            } else {
                if (sum >= 1000) {
                    sum -= 1000;
                    break;
                }
            }
        }
        System.out.print(sum);
    }
}
/**
 * The integer barrier
 * Write a program that reads a sequence of integer numbers in a loop and adds up all numbers. If a new number is equal to 0, the program must stop the loop and output the accumulated sum. When the sum is equal or exceeded 1000 (the barrier), the program should also stop and output the value equal to sum – 1000.
 *
 * Note, the input can contain extra numbers. Just ignore them.
 *
 * Sample Input:
 * 800
 * 101
 * 102
 * 300
 * 0
 *
 * Sample Output:
 * 3
 *
 * Sample Input:
 * 103
 * 105
 * 109
 * 0
 * 1000
 *
 * Sample Output:
 * 317
 */
