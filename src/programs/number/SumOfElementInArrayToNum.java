package programs.number;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfElementInArrayToNum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] numArr = new int[10];

        int sum = scn.nextInt();
        Set<Integer> integerSet = new HashSet<>();
        int num = 0;

        for (int i = 0; i < 10; i++) {
            num = scn.nextInt();
            if (integerSet.contains(sum - num)) {
                System.out.println((sum - num) + " " + num);
                return;
//                break;
            }
            integerSet.add(num);
        }

        System.out.println("No subarray found");
    }

}
