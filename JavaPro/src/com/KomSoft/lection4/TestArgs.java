package com.KomSoft.lection4;

public class TestArgs {
    static double k[] = {5.1, 5.2, 5.3, 5.4, 5.5};

    public  static  double sum(double... nums) {
        double sum = 0;
        System.out.println("Count of arguments = " + nums.length);
        for (double x : nums) {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum = " + sum(k));
        System.out.println("Sum = " + sum(33.4, 2.0));
    }
}
