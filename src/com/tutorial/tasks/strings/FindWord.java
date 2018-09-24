package com.tutorial.tasks.strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений
public class FindWord {

    private String text;
    private int startIndex;
    BufferedReader findText = new BufferedReader(new FileReader(
            "D:\\JavaProjects\\labs\\src\\com\\tutorial\\tasks\\strings\\task3\\test.txt"
    ));

    FindWord(String text) throws FileNotFoundException {
        text = this.text;
    }

    public void setText(String  text) {
        text = this.text;
    }

    public String getText() {
        return text;
    }


    public static void compareTo(String word, String text) {
        int startIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.compareToIgnoreCase(word) < 0) //text.indexOf(word) != -1
                startIndex = text.indexOf(word);
            System.out.println("The word '" + word + "' includes first in text '" + text +
                    "' at position " + startIndex);
            break;
        }


    }
}


