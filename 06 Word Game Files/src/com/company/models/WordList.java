package com.company.models;

import java.util.Locale;

public class WordList {

    private String theWord;

    public WordList(String theWord) {
        this.theWord = theWord;
    }

    public String getTheWord() {
        theWord = theWord.toLowerCase();
        return theWord;
    }

    public void setTheWord(String theWord) {
        this.theWord = theWord;
    }
}
