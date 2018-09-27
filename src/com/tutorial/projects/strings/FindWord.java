package com.tutorial.projects.strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Найти слово в текстовом файле
public class FindWord {

    //String line;
    private String word;
    private int startIndex;
    String wordFromFile;

    private static final String WORD_REGEX = "\\s"; //[\.; \?! \—\,];


    public FindWord(String word) {
        this.word = word;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setWordFromFile() {
        this.wordFromFile = wordFromFile;
    }

    public String getWordFromFile() {
        return wordFromFile;
    }

    public static void compareTo(String word) throws IOException {
        int startIndex = 0;
        BufferedReader reader = new BufferedReader(new FileReader(
                "D:\\JavaProjects\\GitHub\\Java\\src\\com\\tutorial\\projects\\strings\\test.txt"
        ));
        String line;
        String source;

        List<FindWord> findWords = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            String[] splitWord = line.split(WORD_REGEX);

            for (int i = 0; i < splitWord.length - 1; i++) {
                findWords.add(new FindWord(splitWord[i]));
                startIndex = findWords.size();
                source = splitWord[i];
                if (source.equals(word)) {  //text.indexOf(word) != -1 line.compareToIgnoreCase(word) < 0

                    System.out.println("The word '" + word + "' includes in text '" + line +
                            "' at position " + startIndex);
                }
            }

        }
        if ((line = reader.readLine()) == null)
            System.out.println("Слова " + word + " в файле нет");
        reader.close();
    }
}



