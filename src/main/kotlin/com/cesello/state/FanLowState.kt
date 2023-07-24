package com.cesello.state

class FanLowState(val fan: Fan): State() {

    override fun handleRequest() {
        println("Turning fan to medium")
        fan.state = fan.fanMediumState
    }

    override fun toString(): String = "Fan is low"
}