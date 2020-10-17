package com.traincode;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 7, 3, 1, 4, 6, 2, 3, 5 };
        int[] numbersSorted = { 1, 2, 3, 4, 6, 8, 13, 31, 643, 1024 };

        var search = new Search();
        var indexOne = search.linearSearch(numbers, 7);

        var searchBin = new Search();
        var indexTwo = search.binarySearchRec(numbersSorted, 643);

        var searchBinIter = new Search();
        var indexThree = searchBinIter.binarySearchIter(numbersSorted, 643);

        System.out.println(indexThree);
    }

}
