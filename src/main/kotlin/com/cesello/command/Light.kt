package com.cesello.command

data class Light(private var isOn: Boolean = false) {

    fun isOn(): Boolean = isOn
    fun toggle() = if(isOn) off() else on()
    fun on() {
        println("Light switched on.")
        isOn = true
    }

    fun off() {
        println("Light switched off")
        isOn = false
    }
}
