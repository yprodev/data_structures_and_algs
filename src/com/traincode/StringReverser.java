package com.traincode;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        // Approach #1 to iterate through a string
//        for (int i = 0; i < input.length(); i++) {
//            stack.push(input.charAt(i));
//        }

        // Approach #2 to iterate through a string
        for (char ch : input.toCharArray())
            stack.push(ch);

        // A lot of concatinations in this approach...
//        String reversed = "";
//        while (!stack.isEmpty())
//            reversed += stack.pop();

        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
