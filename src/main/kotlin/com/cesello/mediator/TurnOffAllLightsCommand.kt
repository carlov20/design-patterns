package com.cesello.mediator

class TurnOffAllLightsCommand (private val mediator: Mediator): Command {
    override fun execute() {
        mediator.turnOffAllLights()
    }
}