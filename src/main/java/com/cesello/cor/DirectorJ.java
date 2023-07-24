package com.cesello.cor;

public class DirectorJ extends HandlerJ {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestTypeJ.CONFERENCE) {
            System.out.println("Directors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
