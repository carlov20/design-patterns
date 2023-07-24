package com.cesello.mediator

data class Light(val name: String, var isOn: Boolean = false) {

    fun toggle() {
        if(isOn) {
            off()
        } else {
            on()
        }
    }

    private fun on() {
        println("$name Light switched on.")
        isOn = true
    }

    private fun off() {
        println("$name Light switched off.")
        isOn = false
    }
}
