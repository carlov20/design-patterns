package com.cesello.interpreter;

public class OrExpressionJ implements ExpressionJ {

    private ExpressionJ expr1 = null;
    private ExpressionJ expr2 = null;

    public OrExpressionJ(ExpressionJ expr1, ExpressionJ expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
