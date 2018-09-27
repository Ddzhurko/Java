package com.tutorial.projects.strings;

public class Sentence {
    private String s;

    public Sentence(String sentence) {
        this.s = sentence.replaceAll("[,|.|?|!|\\n—|\\n\\n]", ""); //[.|?|!|—|\n\n]
    }

    @Override
    public String toString() {
        return s;

    }
}
