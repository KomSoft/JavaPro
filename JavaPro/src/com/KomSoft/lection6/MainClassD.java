package com.KomSoft.lection6;

public class MainClassD {
    WordTranslator transl;
    Dictionary dictEnRu;

    MainClassD() {
        dictEnRu = new Dictionary();
        transl = new WordTranslator(dictEnRu);
    }

    public static void main(String[] args) {
        new MainClassD();
    }
}
