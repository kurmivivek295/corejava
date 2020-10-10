package jetbrains;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int num, count = 0;
        boolean chain;
        for (int i = 0; i < arr.length - 2; i++) {
            chain = true;
            num = arr[i];
            for (int j = i + 1; j <= i + 2 ; j++) {
                if (num - arr[j] != -1) {
                    chain = false;
                    break;
                }
                num = arr[j];
            }
            if (chain) {
                count++;
            }
        }
        System.out.println(count);
    }
}
/**
 * Triples
 *
 * Write a program that reads an array of ints and outputs the number of "triples" in the array.
 *
 * A "triple" is three consecutive ints in increasing order differing by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not).
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 *
 * Output data format
 *
 * Only a single integer value: the number of "triples".
 *
 *
 * Sample Input:
 * 6
 * 1 2 4 5 6 7
 */
