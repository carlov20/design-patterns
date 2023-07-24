package com.cesello.state

abstract class State {

    open fun handleRequest() = println("Shouldn't be able to get here.")
}