package com.cesello.command;

public class ToggleCommandJ implements CommandJ {

    private LightJ light;

    public ToggleCommandJ(LightJ light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.toggle();
    }
}
