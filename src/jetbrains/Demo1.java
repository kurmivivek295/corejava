package jetbrains;

import java.util.Scanner;

/**
 *A university has decided to open math courses and equip classrooms for 3 groups with
 * special new desks. The faculty agreed that in the sake of productivity only two students
 * may share one table. The enrollment has ended, and now the task is to count the number of desks
 * to order the correct amount from the shop. Of course, the university is short of money,
 * so you need to calculate the minimum of desks. But don't forget that each group will sit in
 * its own classroom!
 * Input data format
 * The program receives the input of the three non-negative integers: the number of students in each of the three groups (the numbers is not bigger than 1000).
 * Sample Input:
 * 20
 * 21
 * 22
 * Sample Output:
 * 32
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] noOfStu = new int[3];
        for (int i = 0; i < noOfStu.length; i++) {
            noOfStu[i] = scanner.nextInt();
        }
        int sum1 = getSum(noOfStu[0]);
        int sum2 = getSum(noOfStu[1]);
        int sum3 = getSum(noOfStu[2]);

        System.out.print(sum1 + sum2 + sum3);
    }

    private static int getSum(int num) {
        return num / 2 + num % 2;
    }
}
