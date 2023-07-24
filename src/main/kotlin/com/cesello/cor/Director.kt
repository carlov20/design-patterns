package com.cesello.cor

class Director(successor: Handler) : Handler(successor) {
    override fun handleRequest(request: Request) {
        if(request.requestType == RequestTypeJ.CONFERENCE) {
            println("Directors can approve conferences")
        } else {
            successor!!.handleRequest(request)
        }
    }
}