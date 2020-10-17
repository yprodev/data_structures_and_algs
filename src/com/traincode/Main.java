package com.traincode;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 7, 3, 1, 4, 6, 2, 3, 5 };
        int[] numbersSorted = { 1, 2, 3, 4, 6, 8, 13, 31, 643, 1024 };

        var search = new Search();
        var index = search.exponentialSearch(numbersSorted, 31);

        System.out.println(index);
    }
}
