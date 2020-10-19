package jetbrains;

import java.util.Scanner;

class Demo4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.print(str.endsWith("burg"));
    }
}

