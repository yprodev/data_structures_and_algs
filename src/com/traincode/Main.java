package com.traincode;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        int front = queue.dequeue();

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
//        queue.enqueue(70);
        System.out.println(front);
        System.out.println(queue);
    }
}
