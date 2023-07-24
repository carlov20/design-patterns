package com.cesello.observer

class TabletClient(subject: Subject) : Observer(subject) {

    init {
        subject.attach(this)
    }

    fun addMessage(message: String) = subject.setState("$message - sent from tablet.")
    override fun update() = println("Tablet stream: ${subject.getState()}")
}