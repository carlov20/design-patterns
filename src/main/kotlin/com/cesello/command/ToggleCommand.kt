package com.cesello.command

class ToggleCommand (private val light: Light): Command {
    override fun execute() {
        light.toggle()
    }
}