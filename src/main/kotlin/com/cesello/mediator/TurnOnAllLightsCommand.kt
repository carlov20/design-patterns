package com.cesello.mediator

class TurnOnAllLightsCommand (private val mediator: Mediator): Command {
    override fun execute() {
        mediator.turnOnAllLights()
    }
}