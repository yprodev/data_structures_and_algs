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
}
