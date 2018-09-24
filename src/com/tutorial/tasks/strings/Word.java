package com.tutorial.tasks.strings;

public class Word {
    private String w;

    public Word(String word) {
        this.w = word.replaceAll("[,|.|?|!|\\s—\\s|\\n\\n—\\s]", "");
    }

    @Override
    public String toString() {
        return w;
    }

}
