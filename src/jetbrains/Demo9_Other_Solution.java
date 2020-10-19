package jetbrains;

import java.util.Arrays;
import java.util.Scanner;

public class Demo9_Other_Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + 1 == arr[i+1] && arr[i] + 2 == arr[i+2]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
