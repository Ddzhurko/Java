package com.tutorial.projects.patterns.states;

public class Demo {

    public static void main(String[] args) {

        TvContext context = new TvContext();
        TvStartState start = new TvStartState();
        TvStopState stop = new TvStopState();

        context.setTvState(start);
        context.doAction();

        context.setTvState(stop);
        context.doAction();
    }
}
