package com.cesello.interpreter

    fun buildInterpreterTree(): Expression {
        val terminal1 = TerminalExpression("Lions")
        val terminal2 = TerminalExpression("Tigers")
        val terminal3 = TerminalExpression("Bears")

        val alternation1 = AndExpression(terminal2, terminal3)

        val alternation2 = OrExpression(terminal1, alternation1)

        return AndExpression(terminal3, alternation2)
    }

    fun main() {
//        val context = "Lions"
//        val context = "Tigers"
//        val context = "Bears"
//        val context = "Lions Tigers"
//        val context = "Lions Bears"
        val context = "Tigers Bears"

        val define = buildInterpreterTree()

        println(context + " is " + define.interpret(context))
    }