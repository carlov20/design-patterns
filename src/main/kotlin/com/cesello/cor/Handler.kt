package com.cesello.cor


abstract class Handler(protected var successor: Handler?) {

    abstract fun handleRequest(request: Request)
}

