package com.cesello.observer

fun main() {
    val subject = MessageStream()

    val phoneClient = PhoneClient(subject)
    val tabletClient = TabletClient(subject)

    phoneClient.addMessage("Here is a new message!")
    tabletClient.addMessage("Another new message!")
}