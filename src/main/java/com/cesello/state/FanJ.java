package com.cesello.state;

public class FanJ {

    private final StateJ fanOffState;
    private final StateJ fanLowState;
    private final StateJ fanMediumState;
    private final StateJ fanHighState;


    private StateJ state;

    public FanJ() {
        fanOffState = new FanOffStateJ(this);
        fanLowState = new FanLowStateJ(this);
        fanMediumState = new FanMediumStateJ(this);
        fanHighState = new FanHighStateJ(this);
        state = fanOffState;
    }

    public StateJ getState() {
        return state;
    }

    public void setState(StateJ state) {
        this.state = state;
    }

    public StateJ getFanOffState() {
        return fanOffState;
    }

    public StateJ getFanLowState() {
        return fanLowState;
    }

    public StateJ getFanMediumState() {
        return fanMediumState;
    }

    public void pullChain() {
        this.state.handleRequest();
    }

    @Override
    public String toString() {
        return this.state.toString();
    }

    public StateJ getHighState() {
        return fanHighState;
    }
}
