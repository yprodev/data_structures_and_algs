package com.traincode;

import java.util.HashMap;

public class Trie {
    private class Node {
        private char value;
        private HashMap<Character, Node> children = new HashMap<>();
        private boolean isEndOfWord;

        public Node(char value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }

        public boolean hasChild(char ch) {
            return children.containsKey(ch);
        }

        public void addChild(char ch) {
            children.put(ch, new Node(ch));
        }

        public Node getChild(char ch) {
            return children.get(ch);
        }

        public Node[] getChildren() {
            return children.values().toArray(new Node[0]); // new Node[0] to return array of Nodes
        }

        public boolean hasChildren() {
            return !children.isEmpty();
        }

        public void removeChild(char ch) {
            children.remove(ch);
        }
    }

    private Node root = new Node(' '); // Root node without any char

    public void insert(String word) {
        Node current = root;

        for(char ch : word.toCharArray()) {
            if (!current.hasChild(ch))
                current.addChild(ch);

            current = current.getChild(ch);
        }

        current.isEndOfWord = true;
    }

    public boolean contains(String word) {
        if (word == null)
            return false;

        Node current = root;

        for (char ch : word.toCharArray()) {
            if (!current.hasChild(ch))
                return false;
            current = current.getChild(ch);
        }

        return current.isEndOfWord;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        // Pre-order: visit the root first
        System.out.println(root.value);

        for (Node child : root.getChildren()) {
            traversePreOrder(child);
        }
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        // Post-order: visit the leaf first
        for (Node child : root.getChildren()) {
            traversePostOrder(child);
        }

        System.out.println(root.value);

    }

    public void remove(String word) {
        if (word == null)
            return;
        
        remove(root, word, 0);
    }

    private void remove(Node root, String word, int index) {
        // Base condition
        if (index == word.length()) {
            // no need to use length - 1, because recursion works starting from the root node
            root.isEndOfWord = false;
            return;
        }

        char ch = word.charAt(index);
        Node child = root.getChild(ch);
        // Need recursively call the remove method
        if (child == null)
            return;

        remove(child, word, index + 1); // Recursive part

        if (!child.hasChildren() && !child.isEndOfWord) {
           root.removeChild(ch);
        }
    }
}
