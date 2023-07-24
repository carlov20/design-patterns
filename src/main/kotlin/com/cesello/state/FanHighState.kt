package com.cesello.state

class FanHighState(val fan: Fan): State() {

    override fun handleRequest() {
        println("Turning fan off")
        fan.state = fan.fanOffState
    }

    override fun toString(): String = "Fan is high"
}