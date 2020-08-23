package com.traincode;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public void insert(int value) {
       Node node = new Node(value);

       if (root == null) {
           root = node;
           return;
       }

       Node current = root;
       while (true) {
           if (value < current.value) {
               if (current.leftChild == null) {
                   current.leftChild = node;
                   break;
               }
               current = current.leftChild;
           } else {
               if (current.rightChild == null) {
                   current.rightChild = node;
                   break;
               }
               current = current.rightChild;
           }
       }
    }

    public boolean find(int value) {
        Node current = root;

        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;

        }

        return false;
    }

    // Overloading for invoking traversePreOrder method without
    // arguments in main (root is private).
    public void traversePreOrder() {
        traversePreOrder(root);
    }
    public void traverseInOrder() {
        traverseInOrder(root);
    }
    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePreOrder(Node root) {
        // Base condition for the recursion termination
        if (root == null) return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    private void traverseInOrder(Node root) {
        // Base condition for the recursion termination
        if (root == null) return;

        traversePreOrder(root.leftChild);
        System.out.println(root.value);
        traversePreOrder(root.rightChild);
    }

    private void traversePostOrder(Node root) {
        // Base condition for the recursion termination
        if (root == null) return;

        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
        System.out.println(root.value);
    }
}
