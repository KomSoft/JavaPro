package com.company;

import java.util.Scanner;

public class ContinueDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (sum < 100 ) {
            System.out.print("Enter a number:");
            int n = in.nextInt();
            if (n < 0) {
                System.out.println("continue");
                continue;
            }
            sum +=n;
            System.out.println("sum = " + sum);
        }
    }
}
