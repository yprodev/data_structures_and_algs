package com.traincode;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 7, 3, 1, 4, 6, 2, 3, 5 };
        var sorter = new BucketSort();
        sorter.sort(numbers, 3);
        System.out.println(Arrays.toString(numbers));
    }

}
