package com.KomSoft.lection3;

/*
	Created by Volodymyr P. Komarov aka KomSoft
*/
public class RegExDemo {
    public static void main(String[] args) {
        String text = "FIFA will never regret it!";
        String[] words = text.split("\\s*(\\s|!|,\\.)\\s*");
        for(String word : words) {
            System.out.println(word);
        }
    }
}
