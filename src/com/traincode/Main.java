package com.traincode;

public class Main {
    public static void main(String[] args) {
        CharFinder finder = new CharFinder();
        char ch = finder.findFirstRepeatedChar("green apple");
        System.out.println(ch);
    }
}
