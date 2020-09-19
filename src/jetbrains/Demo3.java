package jetbrains;

import java.util.Scanner;

/**
 * Snail creeps up the vertical pole of height H feet. It goes A feet up per day,
 * and B feet down per night. In which day the snail will reach the top of the pole?
 * Input data format
 * On the input the program receives non-negative integers H, A, B,
 * where H > B and A > B. Every integer does not exceed 100.
 *  Report a typo
 * Sample Input 1:
 * 10
 * 3
 * 2
 * Sample Output 1:
 * 8
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int upBy = scanner.nextInt();
        int downBy = scanner.nextInt();
        int run = 0;
        int count = 0;
        while (true) {
            run += upBy;
            count++;
            if (run >= height) {
                break;
            }
            run -= downBy;
        }
        System.out.println(count);
    }
}
