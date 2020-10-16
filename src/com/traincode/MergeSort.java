package com.traincode;

public class MergeSort {
    public void sort(int[] array) {
        // Base condition
        if (array.length < 2)
            return;

        // Divide an array into a half
        var middle = array.length / 2;

        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        for (var i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        for (var i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }

        // Sort each half
        sort(left);
        sort(right);

        // Merge the result
        merge(left, right, array);
    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
    }
}
