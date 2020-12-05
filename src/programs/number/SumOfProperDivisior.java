package programs.number;

import java.util.Scanner;

public class SumOfProperDivisior {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        for (int i = 0; i < size; i++) {
            int num = scn.nextInt();
            if (num == findSum(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static int findSum(int num) {
        int result = 0;

        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                if (i == (num / i))
                    result += i;
                else
                    result += (i + num / i);
            }
        }

        return (result + 1);
    }

}
