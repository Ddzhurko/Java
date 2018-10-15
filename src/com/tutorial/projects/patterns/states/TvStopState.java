package com.tutorial.projects.patterns.states;

public class TvStopState implements State {

    @Override
    public void doAction() {
        System.out.println("Tv is turned OFF");
    }
}
