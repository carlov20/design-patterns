package com.cesello.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectJ {

    private List<ObserverJ> observers = new ArrayList<>();

    abstract void setState(String state);
    abstract String getState();

    public void attach(ObserverJ observer) {
        observers.add(observer);
    }

    public void detach(ObserverJ observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(ObserverJ observer : observers) {
            observer.update();
        }
    }

}
