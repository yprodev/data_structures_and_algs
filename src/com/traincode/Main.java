package com.traincode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // built-in hash function
        String s = "watermelon";
        System.out.println(s.hashCode());

        Map<String, String> map = new HashMap<>();
        map.put("123456-A", "John");
        System.out.println(hash("123456-A"));
    }

    public static int hash(String key) {
        int hash = 0;
        for (char ch : key.toCharArray())
            hash += ch;

        return hash % 100;
    }
}
