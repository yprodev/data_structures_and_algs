package com.traincode;

public class SelectionSort {
    public void sort(int[] array) {
        for (var i = 0; i < array.length; i++) {

            swap(array, findMinIndex(array, i), i);
        }
    }

    public void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public int findMinIndex(int[] array, int startIdx) {
        var minIndex = startIdx;

        for (var j = startIdx; j < array.length; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }

        return minIndex;
    }
}
