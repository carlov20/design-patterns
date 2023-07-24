package com.cesello.cor;

public abstract class HandlerJ {

    protected HandlerJ successor;

    public void setSuccessor(HandlerJ successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
