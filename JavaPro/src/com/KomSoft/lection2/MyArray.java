package com.company;

public class MyArray {
    public static void main(String[] args) {
        int a[] = {1, 5, 6, 3};
        int size = a.length;
        System.out.println("Array Elements");
        for(int j=0; j < size; j++) {
            System.out.println("a [" + j + "] = " + a[j]);
        }
        System.out.println("-- for each --");
        for(int elementArr : a) {
            System.out.println("a [] = " + elementArr);
        }
        for (int c = 1; c <= 10; c++) {
            if ( c == 6 )  {
                System.out.println("in break");
                break;
            }
        }
    }
}
