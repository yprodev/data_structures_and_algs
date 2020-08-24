package com.traincode;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        // Result: Left rotate 10
//        // 10 ---> right heavy ---> leftRotate(10)
//        //   20
//        //     30
//        tree.insert(10);
//        tree.insert(20);
//        tree.insert(30);

//         Result: Left rotate 10
        // 10
        //   30 (1) balanceFactor(root.right) > 0
        // 20
        // rightRotate(30)
        // leftRotate(10)

        tree.insert(10);
        tree.insert(30);
        tree.insert(20);
    }
}
