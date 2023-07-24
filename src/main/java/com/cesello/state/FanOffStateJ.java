package com.cesello.state;

public class FanOffStateJ extends StateJ {

    private FanJ fan;

    public FanOffStateJ(FanJ fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Fan is off";
    }
}
