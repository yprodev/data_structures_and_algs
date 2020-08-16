package com.traincode;

public class Main {
    public static void main(String[] args) {
        CharFinder finder = new CharFinder();
        Character result = finder.findFirstNonRepeatingChar("a green apple");

        System.out.println(result);

    }
}
