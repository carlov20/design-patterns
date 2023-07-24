package com.cesello.state

class FanMediumState(val fan: Fan): State() {

    override fun handleRequest() {
        println("Turning fan to high")
        fan.state = fan.fanHighState
    }

    override fun toString(): String = "Fan is medium"
}