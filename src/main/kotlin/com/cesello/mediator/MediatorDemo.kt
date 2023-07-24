package com.cesello.mediator
fun main() {
    val mediator = Mediator()

    val bedroomLight = Light("Bedroom")
    val kitchenLight = Light("Kitchen")

    mediator.registerLight(bedroomLight)
    mediator.registerLight(kitchenLight)

    val turnOnAllLightsCommand = TurnOnAllLightsCommand(mediator)

    turnOnAllLightsCommand.execute()

    val turnOffAllLightsCommand = TurnOffAllLightsCommand(mediator)
    turnOffAllLightsCommand.execute()
}
