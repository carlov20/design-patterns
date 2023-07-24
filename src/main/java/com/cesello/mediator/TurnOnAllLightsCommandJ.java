package com.cesello.mediator;

public class TurnOnAllLightsCommandJ implements CommandJ {

    private MediatorJ mediator;

    public TurnOnAllLightsCommandJ(MediatorJ mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
