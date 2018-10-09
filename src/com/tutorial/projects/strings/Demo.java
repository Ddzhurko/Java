package com.tutorial.projects.strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

    private static final String SENTENСE_REGEX = "[.|?|!|;|-|!-]";//"[.?!-;]+;";
    private static final String WORD_REGEX = "[\\s|.|?|!|;|-|!-]"; //[\.; \?! \—\,];
    private static final String SYMBOL_REGEX = "(?!= [|\\s|,\\s|.|\\f])";

    public static void main(String[] args) throws IOException {
        List<Sentence> sentences = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(
                "D:\\JavaProjects\\GitHub\\Java\\src\\com\\tutorial\\projects\\strings\\test.txt"
        ))) {

            sentences = new ArrayList<>();

            String line;
            //   String last = "";
            while ((line = reader.readLine()) != null) {
                String[] splitSent = line.split(SENTENСE_REGEX);

                for (int i = 0; i < splitSent.length; i++) {
                    sentences.add(new Sentence(splitSent[i]));
                }
            }

//            for (Sentence sentence : sentences) {
//                System.out.println("Sentense: " + sentence);
//            }
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
        for (Sentence s : sentences) {
            System.out.println(s);
        }


        //           last = splitSent[splitSent.length - 1];


        //             WORDS
        List<Word> words = null;
        BufferedReader readerWord = null;

        try {
            readerWord = new BufferedReader(new FileReader(
                    "D:\\JavaProjects\\GitHub\\Java\\src\\com\\tutorial\\projects\\strings\\test.txt"
            ));
            String word;
            words = new ArrayList<>();
            while ((word = readerWord.readLine()) != null) {
                String[] splitWord = word.split(WORD_REGEX);
                for (int i = 0; i < splitWord.length; i++) {
                    words.add(new Word(splitWord[i]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                readerWord.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        for (Word w : words) {
            System.out.println(w);
        }

//             Punctuation marks

        int sum = 0;
        String sign = "";
        char c;
        Pattern pattern = Pattern.compile("[.?!—,]");
        Matcher matcher = Pattern.compile(("[.?!—,]")).matcher(WORD_REGEX);
        BufferedReader readerSign = null;
        try {
            readerSign = new BufferedReader(new FileReader(
                    "D:\\JavaProjects\\GitHub\\Java\\src\\com\\tutorial\\projects\\strings\\test.txt"
            ));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<PunctuationMark> signs = new ArrayList<>();
        while (matcher.find())
         //   System.out.println(matcher.group());
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
                    case ';':
                        sum++;
                        break;
                    case '-':
                        sum++;
                        break;
                }
            }

        }
        readerSign.close();

            //SYMBOL
            BufferedReader readerSymbol = new BufferedReader(new FileReader(
                    "D:\\JavaProjects\\GitHub\\Java\\src\\com\\tutorial\\projects\\strings\\test.txt"
            ));
            String line = "";
            List<Symbol> symbols = new ArrayList<>();
            int total = 0;
            while ((line = readerSymbol.readLine()) != null) {
                String[] splitSymbol = line.split(SYMBOL_REGEX);
                for (int i = 0; i < splitSymbol.length; i++) {
                    symbols.add(new Symbol(splitSymbol[i]));
                }
            }
            readerSymbol.close();
            for (Symbol s : symbols) {
                total++;
                System.out.println(s);
            }

//            // Find word in sentence
//
//
        System.out.println("Number of sentences: " + sentences.size());
        System.out.println("Number of words: " + words.size());
        System.out.println("Numbers of punctuation marks: " + sum);
        System.out.println("Number of symbol: " + total);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException io) {
//            io.printStackTrace();
//        }
        try {
            FindWord.compareTo("even");
        } catch (IOException e) {
            e.printStackTrace();
        }
//    }
    }
}
