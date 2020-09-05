package com.traincode;


public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("canada");

        System.out.println(trie.contains("canada"));
    }
}
