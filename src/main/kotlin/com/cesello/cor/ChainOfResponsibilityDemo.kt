package com.cesello.cor

fun main() {
    val jeff = CEO()
    val crystal = VP(jeff)
    val bryan = Director(crystal)

    bryan.handleRequest(Request(RequestTypeJ.CONFERENCE, 500.0))
    bryan.handleRequest(Request(RequestTypeJ.PURCHASE, 1000.0))
    bryan.handleRequest(Request(RequestTypeJ.PURCHASE, 2000.0))
}