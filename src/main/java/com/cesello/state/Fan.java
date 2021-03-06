package com.cesello.state;

public class Fan {

    private final State fanOffState;
    private final State fanLowState;
    private final State fanMediumState;
    private final State fanHighState;


    private State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMediumState = new FanMediumState(this);
        fanHighState = new FanHighState(this);
        state = fanOffState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMediumState() {
        return fanMediumState;
    }

    public void pullChain() {
        this.state.handleRequest();
    }

    @Override
    public String toString() {
        return this.state.toString();
    }

    public State getHighState() {
        return fanHighState;
    }
}
