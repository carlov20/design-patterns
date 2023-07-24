package com.cesello.observer;

public class TabletClientJ extends ObserverJ {

    private SubjectJ subject;

    public TabletClientJ(SubjectJ subject) {
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
