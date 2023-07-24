package com.cesello.cor

class CEO : Handler(null) {
    override fun handleRequest(request: Request) {
        println("CEOs can approve anything they want")
    }
}