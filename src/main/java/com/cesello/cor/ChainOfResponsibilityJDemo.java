package com.cesello.cor;

public class ChainOfResponsibilityJDemo {

    public static void main(String[] args) {
        DirectorJ bryan = new DirectorJ();
        VPJ crystal = new VPJ();
        CEOJ jeff = new CEOJ();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestTypeJ.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestTypeJ.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestTypeJ.PURCHASE, 2000);
        bryan.handleRequest(request);
    }
}
