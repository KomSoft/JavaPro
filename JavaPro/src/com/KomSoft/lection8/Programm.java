package com.KomSoft.lection8;

public class Programm {

    public static void main(String[] args) {
/*
        Account acc1 = new Account(2334, 5000); // id - Integer
        int accId = (int) acc1.getId();
        System.out.println(accId);

        Account acc2 = new Account("sid5523", 5000);    // id - String
        System.out.println(acc2.getId());
        accId = (int) acc1.getId();     // А так даст ошибку выполнения (компилятор пропустит)!!!

*/
/*
        Account <String> acc1 = new Account<String>("2334", 5000); // id - String
        String accId = acc1.getId();
        System.out.println(accId);

        Account <Integer> acc2 = new Account(5523, 5000);    // id - String
        Integer id = acc2.getId();      // можно писать и int
        System.out.println(id);
*/
/*
        Accountable <String> acc1 = new Account("s1234", 5000);
        Account acc2 = new Account("2345", 5000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
*/

/*
        Accountable <String> acc1 = new Account <>("s1234", 5000);
        Account <String> acc2 = new Account<>("2345", 5000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());

        Printer printer =  new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers =  {23, 4, 5 ,2 , 13, 456, 4};
        printer.<String>print(people);
        printer.<Integer>print(numbers);
*/
        Account <String, Double> acc1 = new Account<String, Double>("s1234", 5000.0);
        String id = acc1.getId();
        Double sum = acc1.getSum();
        System.out.println("Id is: " + id + "   sum:" + sum);


    }

}

/*
class Printer {
    public <T> void print(T[] items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
*/
