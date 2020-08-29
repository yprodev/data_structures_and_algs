package com.traincode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 5, 3, 10, 1, 4, 2};

        Heap heap = new Heap();
        for (int number : numbers)
            heap.insert(number);

//        while(!heap.isEmpty())
//            System.out.println(heap.remove());

        // DESC order
//        for (int i = 0; i < numbers.length; i++)
//            numbers[i] = heap.remove();

        // ASC order
        for (int i = numbers.length - 1; i >= 0; i--)
            numbers[i] = heap.remove();

        System.out.println(Arrays.toString(numbers));
    }
}
