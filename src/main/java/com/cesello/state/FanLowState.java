package com.cesello.state;

public class FanLowState extends State {
    private Fan fan;
    public FanLowState(Fan fan) {
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
