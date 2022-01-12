package com.KomSoft.lection10;

public class TwoExceptionAction {

    public void doAction() {
        try {
            int a = (int) (Math.random() * 2);
            System.out.println("a = " + a);
            int c[] = {1/a};    // опасное место
            c[a] = 71;          // опасное место №2
        } catch (ArithmeticException e) {
            System.out.println("деление на 0! " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound: " + e);
        }
        System.out.println("After try-catch block");
    }

    public static void main(String[] args) {
        TwoExceptionAction tea = new TwoExceptionAction();
        tea.doAction();
    }
}
