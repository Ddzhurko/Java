package com.tutorial.tasks.strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений
public class FindWord {

    String line;
    private String word;
    private int startIndex;

    private static final String WORD_REGEX = "\\s"; //[\.; \?! \—\,];


    public FindWord(String word) {
        this.word = word;
    }

    public static void compareTo(String word) throws IOException {
        int startIndex = 0;
        BufferedReader reader = new BufferedReader(new FileReader(
                "D:\\JavaProjects\\labs\\src\\com\\tutorial\\tasks\\strings\\task3\\test.txt"
        ));
        String line = reader.readLine();
        List<FindWord> findWords = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
           String[] splitWord = line.split(WORD_REGEX);

            for (int i = 0; i < splitWord.length -1; i++) {
                findWords.add(new FindWord(splitWord[i]));
                if (splitWord[i] == word) //text.indexOf(word) != -1 line.compareToIgnoreCase(word) < 0
                    startIndex = i;
                System.out.println("The word '" + word + "' includes first in text '" + splitWord[i] +
                        "' at position " + startIndex);
                break;
            }
        }
        reader.close();
//        for (FindWord find:findWords ){
//            System.out.println("find: " + find);
//        }

    }
    @Override
    public String toString(){
        return line;
    }
}


