package com.cesello.state;

public class StateEverydayDemo {

    public static void main(String[] args) {
        FanJ fan = new FanJ();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
    }
}
