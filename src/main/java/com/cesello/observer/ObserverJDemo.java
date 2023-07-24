package com.cesello.observer;

public class ObserverJDemo {

    public static void main(String[] args) {
        SubjectJ subject = new MessageStreamJ();

        PhoneClientJ phoneClient = new PhoneClientJ(subject);
        TabletClientJ tabletClient = new TabletClientJ(subject);

        phoneClient.addMessage("Here is a new message!");
        tabletClient.addMessage("Another new message!");
    }
}
