package com.traincode;

import java.util.HashMap;

public class CharFinder {
    public char findFirstNonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();

        for (char ch : chars) {
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (char ch : chars)
            if (map.get(ch) == 1)
                return ch;


        return Character.MIN_VALUE;
    }
}
