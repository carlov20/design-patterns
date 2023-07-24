package com.cesello.observer;

public class PhoneClientJ extends ObserverJ {

    public PhoneClientJ(SubjectJ subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from phone");
    }

    @Override
    void update() {
        System.out.println("Phone stream: " + subject.getState());
    }
}
