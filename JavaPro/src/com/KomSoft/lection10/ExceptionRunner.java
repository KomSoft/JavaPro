package com.KomSoft.lection10;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ExceptionRunner {

/*
    public double parseFromFrance(String numberStr){
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        try {
            double numFr = nfFr.parse(numberStr).doubleValue();
            return numFr;
        } catch (ParseException e) {
            // проверяемое исключение
//            System.out.println();
            System.err.println(e);
            return 0; // что не есть хорошо
        }

    }
*/

    public double parseFromFrance(String numberStr) throws ParseException {
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
            double numFr = nfFr.parse(numberStr).doubleValue();
            return numFr;
    }


    public static void main(String[] args) {
        ExceptionRunner exceptionRunner = new ExceptionRunner();
        String number = " 333";
/*
        System.out.println(exceptionRunner.parseFromFrance(number));
*/
        double result = 0;
        try {
            result = exceptionRunner.parseFromFrance(number);
        } catch (ParseException e) {
            System.err.println(e);
        }
        System.out.println(result);
    }

    public void doAction() throws ParseException {

    }
}
