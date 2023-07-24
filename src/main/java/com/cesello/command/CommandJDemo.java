package com.cesello.command;

import java.util.ArrayList;
import java.util.List;

// client
public class CommandJDemo {

    public static void main(String[] args) {
        LightJ bedroomLight = new LightJ();
        LightJ kitchenLight = new LightJ();
        SwitchJ lightSwitch = new SwitchJ();

//        Command onCommand = new OnCommand(bedroomLight);
//        lightSwitch.storeAndExecute(onCommand);

        CommandJ toggleCommand = new ToggleCommandJ(bedroomLight);
//
        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);

        List<LightJ> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        CommandJ allLightsCommand = new AllLightsCommandJ(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
//        lightSwitch.storeAndExecute(allLightsCommand);
//        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
