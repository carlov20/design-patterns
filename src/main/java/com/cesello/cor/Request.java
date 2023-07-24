package com.cesello.cor;

public class Request {

    private RequestTypeJ requestType;
    private double amount;

    public Request(RequestTypeJ requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestTypeJ getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }
}
