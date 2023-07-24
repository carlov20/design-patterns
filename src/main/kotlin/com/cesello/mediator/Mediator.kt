package com.cesello.mediator

class Mediator(private val lights: MutableList<Light> = ArrayList()) {

    fun registerLight(light: Light) = lights.add(light)

    fun turnOnAllLights() = lights.filter { !it.isOn }.forEach { it.toggle() }

    fun turnOffAllLights() = lights.filter { it.isOn }.forEach { it.toggle() }
}