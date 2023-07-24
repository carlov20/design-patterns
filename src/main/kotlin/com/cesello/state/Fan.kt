package com.cesello.state

class Fan {
    val fanOffState: State = FanOffState(this)
    val fanLowState: State = FanLowState(this)
    val fanMediumState: State = FanMediumState(this)
    val fanHighState: State = FanHighState(this)

    var state: State = fanOffState

    fun pullChain() = state.handleRequest()

    override fun toString(): String = state.toString()
}