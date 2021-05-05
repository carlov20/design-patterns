package com.cesello.observer;

public abstract class Observer {

    protected Subject subject;
    abstract void update();

}
