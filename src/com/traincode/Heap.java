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

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        int root = items[0];

        items[0] = items[--size];

        bubbleDown();

        return root;
    }

    private void bubbleDown() {
        int idx = 0;
        while(idx <= size && !isValidParent(idx)) {
            int largerChildIndex = largerChildIdx(idx);

            swap(idx, largerChildIndex);
            idx = largerChildIndex;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int largerChildIdx(int index) {
        if (!hasLeftChild(index))
            return index;

        if (!hasRightChild(index))
            return leftChildIndex(index);

        return (leftChild(index) > rightChild(index)) ? leftChildIndex(index) : rightChildIndex(index);
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) <= size;
    }

    private boolean hasRightChild(int index) {
        return rightChildIndex(index) <= size;
    }

    private boolean isValidParent(int index) {
        if (!hasLeftChild(index))
            return true;

        boolean isValid = items[index] >= leftChild(index);

        if (hasRightChild(index))
            isValid &= items[index] >= rightChild(index);

        return isValid;
    }

    private int rightChild(int index) {
        return items[rightChildIndex(index)];
    }

    private int leftChild(int index) {
        return items[leftChildIndex(index)];
    }

    private int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    private int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    public boolean isFull() {
        return size == items.length;
    }

    public int max() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[0];
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
