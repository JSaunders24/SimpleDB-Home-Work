package com.company.controllers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetWord {

    private BufferedReader in;
    private String[] words;
    private String theWord;

    public GetWord() {

        try {
            Path thePath = Paths.get("src/" + "wordlist.txt");

            //FileReader fileReader = new FileReader(String.valueOf(thePath));
            //BufferedReader in = new BufferedReader(fileReader);

            in = new BufferedReader(new FileReader(String.valueOf(thePath)));

            List<String> lines = new ArrayList<>();

            String line = null;

            try{
                line = in.readLine();

                while(line != null){
                    lines.add(line);
                    line = in.readLine();
                }

                in.close();

                words = lines.toArray(new String[lines.size()]);

                theWord = getRandomWord(words);

            } catch(IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getTheWord() {
        return theWord;
    }

    public void setTheWord(String theWord) {
        this.theWord = theWord;
    }

    private String getRandomWord(String[] words){
        int rand = new Random().nextInt(words.length);
        return words[rand];
    }


}
