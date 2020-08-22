package com.traincode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(6, "A"); // index = 1
        table.put(8, "B"); // index = 3
        table.put(11, "C"); // index = 1
        table.put(6, "A+"); // Override with the new value

        System.out.println(table.get(10));
    }
}
