package com.cesello.cor;

public class VPJ extends HandlerJ {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestTypeJ.PURCHASE) {
            if(request.getAmount() < 1500) {
                System.out.println("VPs can approve purchases below 1500");
            } else {
                successor.handleRequest(request);
            }
        }
    }
}
