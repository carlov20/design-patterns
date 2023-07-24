package com.cesello.command;

public class OnCommandJ implements CommandJ {
    private LightJ light;
    public OnCommandJ(LightJ light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
