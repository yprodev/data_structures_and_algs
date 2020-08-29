package com.traincode;

public class Heap {
    private int[] items = new int[10];
    private int size;

    public void insert(int value) {
        if (isFull())
            throw new IllegalStateException();

        items[size++] = value;
        bubbleUp();
    }

    public boolean isFull() {
        return size == items.length;
    }

    private void bubbleUp() {
        int idx = size - 1;
        while(idx > 0 && items[idx] > items[getParent(idx)]) {
            swap(idx, getParent(idx));
            idx = getParent(idx);
        }
    }

    private int getParent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }
}
