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

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        // Empty tree
        if (root == null)
            return -1;

        // Base condition
        if (isLeaf(root))
            return 0;

        return 1 + Math.max(
                height(root.leftChild),
                height(root.rightChild));
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    public int minBinary() {
        return min(root);
    }

    // O(n)
    private int min(Node root) {
        // This is the algorithm to find min value
        // in binary tree (not binary search tree).
        if (isLeaf(root))
            return root.value;

        int left = min(root.leftChild);
        int right = min(root.leftChild);

        return Math.min(Math.min(left, right), root.value);
    }

    // O(log n)
    public int minBinarySearch() {
        if (root == null)
            throw new IllegalStateException();

        Node current = root;
        Node last = current;

        while (current != null) {
            last = current;
            current = current.leftChild;
        }

        return last.value;
    }

    public boolean equals(Tree other) {
        if (other == null)
            return false;
        
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;

        if (first != null && second != null)
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);

        return false;
    }

}
