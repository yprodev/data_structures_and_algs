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
    }

    private Node root = new Node(' '); // Root node without any char

    public void insert(String word) {
        Node current = root;

        for(char ch : word.toCharArray()) {
            if (current.children.get(ch) == null)
                current.children.put(ch, new Node(ch));

            current = current.children.get(ch);
        }

        current.isEndOfWord = true;
    }
}
