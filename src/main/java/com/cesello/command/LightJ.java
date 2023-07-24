package com.cesello.command;

// receiver
public class LightJ {

    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if(isOn) {
            off();
        } else {
            on();
        }
    }

    public void on() {
        System.out.println("Light switched on.");
        isOn = true;
    }

    public void off() {
        System.out.println("Light switched off.");
        isOn = false;
    }
}
