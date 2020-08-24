package com.traincode;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        // 10 ---> right heavy
        //   20
        //     30
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);

    }
}
