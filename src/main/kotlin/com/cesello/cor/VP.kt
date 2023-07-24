package com.cesello.cor

class VP(successor: Handler) : Handler(successor) {
    override fun handleRequest(request: Request) {
        if(request.requestType == RequestTypeJ.PURCHASE && request.amount < 1500) {
            println("VPs can approve purchases below 1500")
        } else {
            successor!!.handleRequest(request)
        }
    }
}