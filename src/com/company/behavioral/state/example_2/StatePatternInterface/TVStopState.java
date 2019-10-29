package com.company.behavioral.state.example_2.StatePatternInterface;

public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }

}
