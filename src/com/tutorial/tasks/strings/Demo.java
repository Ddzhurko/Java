package com.tutorial.tasks.strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    private static final String SENTENСE_REGEX = "(?=[.|?|!|—]|\\n)"; //(?=[\.\!\?]);
    private static final String WORD_REGEX = "\\s"; //[\.; \?! \—\,];
    private static final String SYMBOL_REGEX = "(?!= [|\\s|,\\s|.|\\f])";

//    private static final String SIGN_REGEX = "[.;?!—,]";

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "D:\\JavaProjects\\labs\\src\\com\\tutorial\\tasks\\strings\\task3\\test.txt"
            ));

            List<Sentence> sentences = new ArrayList<>();

            String line;
            String last = "";
            while ((line = reader.readLine()) != null) {
                String[] splitSent = line.split(SENTENСE_REGEX);

//                if (splitSent.length == 1) {
//                    if (splitSent[0].equals("")) {
//                        continue;
//                    }
//                    if (Character.isLowerCase(splitSent[0].charAt(0))) {
//                        sentences.add(new Sentence(last + " " + splitSent[0]));
//                    } else {
//                        sentences.add(new Sentence(splitSent[0]));
//                    }
//                } else {
//                    if (splitSent[0].equals("")) {
//                        continue;
//                    }
//                    if (Character.isLowerCase(splitSent[0].charAt(0))) {
//                        sentences.add(new Sentence(last + " " + splitSent[0]));
//                    } else {
                for (int i = 0; i < splitSent.length - 1; i++) {
                    sentences.add(new Sentence(splitSent[i]));
                }
            }


            //           last = splitSent[splitSent.length - 1];

            reader.close();

            for (Sentence s : sentences) {
                System.out.println(s);
            }
            // WORDS

            BufferedReader readerWord = new BufferedReader(new FileReader(
                    "D:\\JavaProjects\\labs\\src\\com\\tutorial\\tasks\\strings\\task3\\test.txt"
            ));
            String word;
            List<Word> words = new ArrayList<>();
            while ((word = readerWord.readLine()) != null) {
                String[] splitWord = word.split(WORD_REGEX);
                for (int i = 0; i < splitWord.length - 1; i++) {
                    words.add(new Word(splitWord[i]));
                }
            }
            readerWord.close();
            for (Word w : words) {
                System.out.println(w);
            }
            // Punctuation marks

            int sum = 0;
            String sign = "";
            char c;
            //  Pattern pattern = Pattern.compile("[.?!—,]");
            //   Matcher matcher = Pattern.compile(("[.?!—,]")).matcher();
            BufferedReader readerSign = new BufferedReader(new FileReader(
                    "D:\\JavaProjects\\labs\\src\\com\\tutorial\\tasks\\strings\\task3\\test.txt"
            ));
            List<PunctuationMark> signs = new ArrayList<>();
//            while (matcher.find())
//                System.out.println(matcher.group());
            while ((sign = readerSign.readLine()) != null) {
                for (int i = 0; i < sign.length(); i++) {
                    switch (sign.charAt(i)) {
                        case '.':
                            sum++;
                            break;
                        case ',':
                            sum++;
                            break;
                        case '?':
                            sum++;
                            break;
                        case '!':
                            sum++;
                            break;
                        case '—':
                            sum++;
                            break;
                    }
                }

            }
             readerSign.close();

            //SYMBOL
            BufferedReader readerSymbol = new BufferedReader(new FileReader(
                    "D:\\JavaProjects\\labs\\src\\com\\tutorial\\tasks\\strings\\task3\\test.txt"
            ));
            List<Symbol> symbols = new ArrayList<>();
            int total = 0;
            while ((line = readerSymbol.readLine()) != null){
                String[] splitSymbol = line.split(SYMBOL_REGEX);
                for (int i = 0; i < splitSymbol.length - 1; i++) {
                    symbols.add(new Symbol(splitSymbol[i]));
                }
            }
            readerSymbol.close();
            for (Symbol s:symbols){
                total++;
                System.out.println(s);
            }

            // Find word in sentence



            System.out.println("Number of sentences: " + sentences.size());
            System.out.println("Number of words: " + words.size());
            System.out.println("Numbers of punctuation marks: " + sum);
            System.out.println("Number of symbol: " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }
        try {
            FindWord.compareTo("Яксли");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}