package com.cesello.command

class AllLightsCommand(private val lights: List<Light>): Command {
    override fun execute() {
        lights
            .filter { it.isOn() }
            .forEach { it.toggle() }
    }
}