package com.cesello.state;

public class FanMediumState  extends State {

    private Fan fan;

    public FanMediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning Fan to high.");
        fan.setState(fan.getHighState());
    }

    @Override
    public String toString() {
        return "Fan is medium";
    }
}
