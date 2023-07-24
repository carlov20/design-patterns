package com.cesello.observer

import java.util.Deque
import java.util.LinkedList

class MessageStream(private val messageHistory: Deque<String> = LinkedList()): Subject() {
    override fun setState(message: String) {
        messageHistory.add(message)
        this.notifyObservers()
    }

    override fun getState(): String = messageHistory.last

}