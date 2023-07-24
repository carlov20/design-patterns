package com.cesello.command;

import java.util.List;

public class AllLightsCommandJ implements CommandJ {

    private List<LightJ> lights;

    public AllLightsCommandJ(List<LightJ> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(light -> {
            if(light.isOn()) {
               light.toggle();
            }
        });
    }
}
