package com.traincode;

public class Main {
    public static void main(String[] args) {
        // operation:   Priority Queue       Heap
        // insert:      O(n)                 O(log n)
        // remove:      O(1)                 O(log n)
        PriorityQueue queue = new PriorityQueue();
        queue.add(30);
        queue.add(20);
        queue.add(10);
        queue.add(5);
        System.out.println(queue);
    }
}
