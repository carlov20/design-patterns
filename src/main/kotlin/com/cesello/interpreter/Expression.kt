package com.cesello.interpreter

interface Expression {

    fun interpret(context: String): Boolean
}