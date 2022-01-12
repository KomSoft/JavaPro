package com.company;

import java.util.Random;
import java.util.Scanner;

public class Random1 {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();

        int rand = random.nextInt(10);
       System.out.println(rand);
       int count = 0;
        while (true ){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число до 10: ");
            if (scanner.hasNextInt()) {
                count++;
                int numb = scanner.nextInt();
                if (numb == rand ) {
                    System.out.println("Hooray!");
                }
             }
            System.out.print("Желаете продолжить (Y): ");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("Y")) {
                break;
            }

         }
        System.out.println("Сделано " + count + " хода(ов).");
    }
}
