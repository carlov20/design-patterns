package com.cesello.mediator;

public class MediatorJDemo {

    public static void main(String[] args) {
        MediatorJ mediator = new MediatorJ();

        LightJ bedroomLight = new LightJ("Bedroom");
        LightJ kitchenLight = new LightJ("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        CommandJ turnOnAllLightsCommandJ = new TurnOnAllLightsCommandJ(mediator);

        turnOnAllLightsCommandJ.execute();

        CommandJ turnOffAllLightsCommandJ = new TurnOffAllLightsCommandJ(mediator);

        turnOffAllLightsCommandJ.execute();
    }

}
