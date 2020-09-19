package jetbrains;

import java.util.Scanner;

public class Demo5 {

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
