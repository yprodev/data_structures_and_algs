package com.traincode;

public class Main {
    public static void main(String[] args) {
        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        int first = queue.dequeue();
        int second = queue.peek();

        System.out.println(first);
        System.out.println(second);
    }
}
