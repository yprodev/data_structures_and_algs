package com.traincode;

public class AVLTree {
    private class AVLNode {
        private int value;
        private int height;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value=" + this.value;
        }
    }

    private AVLNode root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private AVLNode insert(AVLNode root, int value) {
        if (root == null)
            return new AVLNode(value);

        if (value < root.value)
            root.leftChild = insert(root.leftChild, value);
        else
            root.rightChild = insert(root.rightChild, value);

        root.height = Math.max(
                height(root.leftChild),
                height(root.rightChild)) + 1;

        balance(root);

        return root;
    }

    private void balance(AVLNode root) {
        // balance factor = height(L) - height(R)
        // 5 - 4 = 1 - balanced
        // 5 - 3 = 2 - not balanced

        // if (balance factor > 1) => left heavy ==> rotate right
        // if (balance factor < -1) => right heavy ==> rotate left

        if (isLeftHeavy(root)) {
            if (getBalanceFactor(root.leftChild) < 0)
                System.out.println("Left rotate " + root.leftChild.value);
            System.out.println("right rotate " + root.value);
        }
        else if (isRightHeavy(root)) {
            if (getBalanceFactor(root.rightChild) > 0)
                System.out.println("Right rotate " + root.rightChild.value);
            System.out.println("Left rotate " + root.value);
        }
    }

    private boolean isLeftHeavy(AVLNode node) {
        return getBalanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node) {
        return getBalanceFactor(node) < -1;
    }

    private int getBalanceFactor(AVLNode node) {
        return (node == null) ? 0 : height(node.leftChild) - height(node.rightChild);
    }

    private int height(AVLNode node) {
        return (node == null) ? -1 : node.height;
    }
}
