package com.tutorial.tasks.strings;

public class Symbol {

    private String s;

    public Symbol(String symbol) {
        s = symbol.replaceAll("[,|.|?|!]", "");
    }

    @Override
    public String toString() {
        return s;
    }


}
