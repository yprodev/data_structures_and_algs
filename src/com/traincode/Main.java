package com.traincode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        int[] numbers = {1, 2, 3, 3, 2, 1, 4, 6};

        for (int number : numbers)
            set.add(number);

        System.out.println(set);
    }
}
