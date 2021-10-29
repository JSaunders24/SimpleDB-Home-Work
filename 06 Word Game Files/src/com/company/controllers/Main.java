package com.company.controllers;

import com.company.models.WordList;
import com.company.views.CmdLineView;

public class Main {

    public static String[] letters;
    public static int numLetters = 0;
    public static int numGuesses;
    public static String theGuess;
    public static String[] hints;
    public static  CmdLineView view;

    public static void main(String[] args) {

        numGuesses = 6;

        GetWord getWord = new GetWord();
        String theWord = getWord.getTheWord();

        WordList word = new WordList(theWord);

        //WordList word = new WordList(getWord.getTheWord());

        letters = calculateLetters(word.getTheWord());

        view = new CmdLineView(letters);
        view.startGame();
        view.cheat(word.getTheWord());

        while(numGuesses > 0){
            hints = guess();
            view.displayHints(hints);
            //display
            //System.out.println(hints);
        }
    }

    private static String[] calculateLetters(String theWord){
        String[] letters = theWord.split("");
        numLetters = letters.length;
        return letters;
    }

    private static String[] guess(){

        theGuess = view.makeAGuess();

        String msg = "";

        String[] hints = new String[letters.length];

        for(int i = 0; i < letters.length; i++){
            if(letters[i].equals(theGuess)){
                hints[i] = theGuess;
            }
            else {
                hints[i] = "_";
            }
        }

        return hints;
    }
}
