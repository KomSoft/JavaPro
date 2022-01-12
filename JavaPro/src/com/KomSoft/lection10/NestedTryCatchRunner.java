package com.KomSoft.lection10;

public class NestedTryCatchRunner {

    public void doAction() {
        try {   // outer block
            int a = (int) (Math.random() * 2) - 1;
            System.out.println("a = " + a);
            try {   // inner block
                int b = 1 / a;
                StringBuilder sb = new StringBuilder(a);
            } catch (NegativeArraySizeException e) {
                System.err.println("недопустимый размер буфера: " + e);
            }
        } catch (ArithmeticException e) {
            System.err.println("деление на 0: " + e);
        }
    }

    public static void main(String[] args) {
        NestedTryCatchRunner ntre = new NestedTryCatchRunner();
        ntre.doAction();
    }
}
