package com.cesello.observer;

public class TabletClient extends Observer{

    private Subject subject;

    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        this.subject.setState(message + " - sent from tablet.");
    }

    @Override
    void update() {
        System.out.println("Tablet stream: " + subject.getState());
    }
}
