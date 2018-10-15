package com.tutorial.projects.patterns.states;

public class TvContext implements State {

    private State tvState;

    public void setTvState(State state) {
        this.tvState = state;
    }

    public State getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
