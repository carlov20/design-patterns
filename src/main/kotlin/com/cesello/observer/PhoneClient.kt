package com.cesello.observer

class PhoneClient(subject: Subject) : Observer(subject) {

    init {
        subject.attach(this)
    }

    fun addMessage(message: String) = subject.setState("$message - sent from phone")
    override fun update() = println("Phone stream: ${subject.getState()}")
}