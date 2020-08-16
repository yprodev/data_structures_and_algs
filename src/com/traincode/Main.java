package com.traincode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Steven");
        map.put(2, "John");
        map.put(3, "Elizabeth");
        map.put(3, "Alice");
        map.put(4, null);
        map.put(null, null);
        map.remove(null);
        String alice = map.get(3);
        boolean isThreeKey = map.containsKey(3); // O(1)
        boolean isJohn = map.containsValue("John"); // O(n)

        System.out.println(map);
        System.out.println("is 3 key? " + isThreeKey);
        System.out.println("is John value? " + isJohn);
        System.out.println(alice);

        for (int item : map.keySet())
            System.out.println(item);

        for (Map.Entry<Integer, String> item : map.entrySet())
            System.out.println(item);
    }
}
