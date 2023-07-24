package com.cesello.state

class FanOffState(val fan: Fan): State() {

    override fun handleRequest() {
        println("Turning fan on to low")
        fan.state = fan.fanLowState
    }

    override fun toString(): String = "Fan is off"
}