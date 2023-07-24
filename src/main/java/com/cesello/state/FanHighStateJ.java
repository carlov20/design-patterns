package com.cesello.state;

public class FanHighStateJ extends StateJ {

    private FanJ fan;

    public FanHighStateJ(FanJ fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning Fan off");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is high";
    }
}
