package com.cesello.state;

public class FanLowStateJ extends StateJ {
    private FanJ fan;
    public FanLowStateJ(FanJ fan) {
        super();
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to medium");
        fan.setState(fan.getFanMediumState());
    }

    @Override
    public String toString() {
        return "Fan is low";
    }
}
