package com.company.behavioral.state.example_2.StatePatternInterface;

public class TVContext implements State {

    private State tvState;

    public void setState(State state) {
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