package com.cesello.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorJ {

    private List<LightJ> lights = new ArrayList<>();

    public void registerLight(LightJ light) {
        lights.add(light);
    }

    public void turnOnAllLights() {
        for(LightJ light : lights) {
            if(!light.isOn()) {
                light.toggle();
            }
        }
    }

    public void turnOffAllLights() {
        for(LightJ light : lights) {
            if(light.isOn()) {
                light.toggle();
            }
        }
    }
}
