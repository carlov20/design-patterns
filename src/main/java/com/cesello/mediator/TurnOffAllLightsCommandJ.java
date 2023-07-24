package com.cesello.mediator;

public class TurnOffAllLightsCommandJ implements CommandJ {

    private MediatorJ mediator;

    public TurnOffAllLightsCommandJ(MediatorJ mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
