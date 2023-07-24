package com.cesello.state;

public class FanMediumStateJ extends StateJ {

    private FanJ fan;

    public FanMediumStateJ(FanJ fan) {
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
