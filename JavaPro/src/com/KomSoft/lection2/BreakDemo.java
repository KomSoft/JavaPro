package com.company;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        read_data:
        while (n < 10) {
            for (int a = 1; a < 3; a++) {
                System.out.print("Enter a number >= 0 :");
                n = in.nextInt();
                if (n < 0) {
                    break read_data;
                }
            }
        }
        if (n <= 10 ) {
            System.out.println("after break");
        } else {
            System.out.println("after break in else");
        }

    }
}
