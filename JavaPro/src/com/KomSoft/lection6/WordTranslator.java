package com.KomSoft.lection6;

import java.util.Scanner;

public class WordTranslator {
    private Dict dict;

    public WordTranslator(Dict dict) {
        this.dict = dict;
        Scanner in = new Scanner(System.in);
        String word;
        do {
            System.out.print("Введите слово для поиска (ext - выход): ");
            word = in.nextLine();
            System.out.println(" - " + dict.findTranslation(word));
        } while (!word.equalsIgnoreCase("ext"));
    }

    public String getTranslation(String word) {
        return null;
    }
}
