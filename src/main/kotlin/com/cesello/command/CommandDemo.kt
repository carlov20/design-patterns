package com.cesello.command

fun main() {
    val bedroomLight = Light()
    val kitchenLight = Light()
    val lightSwitch = Switch()

//    val onCommand = OnCommand(bedroomLight)
//    lightSwitch.storeAndExecute(onCommand)

    val toggleCommand = ToggleCommand(bedroomLight)
    lightSwitch.storeAndExecute(toggleCommand)
//    lightSwitch.storeAndExecute(toggleCommand)
//    lightSwitch.storeAndExecute(toggleCommand)

    val lights = listOf(bedroomLight, kitchenLight)

    val allLightsCommand = AllLightsCommand(lights)
    lightSwitch.storeAndExecute(allLightsCommand)
}