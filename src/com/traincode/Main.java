package com.traincode;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Edge cases
        // (
        // (()
        // ( >
        // ( ]
        // ) (
        String str0 = "(1 + 2)"; // balanced string
        String str1 = "(1 + 2"; // not balanced string
        String str2 = ")1 + 2("; // not balanced string
        String str3 = "(1 + 2>"; // not balanced string
        String str4 = "(([1] + <2>))[a]"; // balanced string

        String edge0 = "(1 + 2";
        String edge1 = "((1 + 2)";
        String edge2 = ")1 + 2(";
        String edge3 = "(1 + 2>";
        String edge4 = "(1 + 2]";
        String edge5 = "(1 + 2}";

        // Let's work only with str0
        Expression exp = new Expression();
        Boolean result = exp.isBalanced(edge5);
        System.out.println(result);

    }
}
