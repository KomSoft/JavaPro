package com.KomSoft.lection6;

public class Dictionary implements Dict {
    private String[] ruWord = {"слово", "читать", "солнце", "делать", "идти"};
    private String[] enWord = {"word", "read", "sun", "do", "go"};

    public Dictionary(){

    }

    @Override
    public String findTranslation(String str) {
        for (int i = 0; i < ruWord.length; i++) {
            if (ruWord[i].compareToIgnoreCase(str) == 0 ) {
                return enWord[i];
            }
            if (enWord[i].compareToIgnoreCase(str) == 0 ) {
                return ruWord[i];
            }
        }
        return ">> Перевод не найден! <<";
    }

    @Override
    public boolean addWord(String string, String string2) {
        return false;
    }

    @Override
    public boolean delWord(String string) {
        return false;
    }
}
