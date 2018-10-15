package com.tutorial.projects.patterns.states;

public class TvStartState implements State {

    @Override
    public void doAction() {
        System.out.println("Tv is turned ON");
    }
}
