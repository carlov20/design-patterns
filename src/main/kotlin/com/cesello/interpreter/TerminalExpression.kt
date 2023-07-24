package com.cesello.interpreter

import java.util.StringTokenizer

class TerminalExpression (private val data: String): Expression {
    override fun interpret(context: String): Boolean {
        val st = StringTokenizer(context)
        while(st.hasMoreTokens()) {
            val test = st.nextToken()
            if(test == data) {
                return true
            }
        }
        return false
    }
}