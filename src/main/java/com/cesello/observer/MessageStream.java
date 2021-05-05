package com.cesello.observer;

import java.util.Deque;
import java.util.LinkedList;

public class MessageStream extends Subject {

    private Deque<String> messageHistory = new LinkedList<>();

    @Override
    void setState(String message) {
        messageHistory.add(message);
        this.notifyObservers();
    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
}
