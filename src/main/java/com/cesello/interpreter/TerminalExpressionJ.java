package com.cesello.interpreter;

import java.util.StringTokenizer;

public class TerminalExpressionJ implements ExpressionJ {

    private String data;

    public TerminalExpressionJ(String data) {
        this.data = data;
    }
    @Override
    public boolean interpret(String context) {
        StringTokenizer st = new StringTokenizer(context);
        while(st.hasMoreTokens()) {
            String test = st.nextToken();
            if(test.equals(data)){
                return true;
            }
        }
        return false;
    }
}
