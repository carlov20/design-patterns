package com.cesello.command

class OnCommand(private val light: Light): Command {
    override fun execute() {
        light.on()
    }
}