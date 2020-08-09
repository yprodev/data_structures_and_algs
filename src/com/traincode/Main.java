package com.traincode;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = "abcd";

        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(str);

        System.out.println(result);
    }
}
