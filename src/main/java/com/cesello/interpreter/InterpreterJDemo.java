package com.cesello.interpreter;

public class InterpreterJDemo {

    static ExpressionJ buildInterpreterTree() {
        ExpressionJ terminal1 = new TerminalExpressionJ("Lions");
        ExpressionJ terminal2 = new TerminalExpressionJ("Tigers");
        ExpressionJ terminal3 = new TerminalExpressionJ("Bears");

        // Tigers and Bears
        ExpressionJ alternation1 = new AndExpressionJ(terminal2, terminal3);

        // Lions or (Tigers and Bears)
        ExpressionJ alternation2 = new OrExpressionJ(terminal1, alternation1);

        return new AndExpressionJ(terminal3, alternation2);

    }

    public static void main(String[] args) {

//        String context = "Lions";
//        String context = "Tigers";
//        String context = "Bears";
//        String context = "Lions Tigers";
//        String context = "Lions Bears";
        String context = "Tigers Bears";

        ExpressionJ define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));

    }
}
