package com.cesello.command

class Switch {

    fun storeAndExecute(command: Command) {
        command.execute()
    }
}