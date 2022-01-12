package com.KomSoft.lection6;

public interface Dict {

    /**
     *
     * @param word
     * @return
     */
    String findTranslation(String word);

    /**
     *
     * @param word
     */
    boolean addWord(String word, String translation);

    /**
     *
     * @param word
     * @return
     */
    boolean delWord(String word);
}
