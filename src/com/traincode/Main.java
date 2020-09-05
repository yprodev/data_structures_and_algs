package com.traincode;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("car");
        trie.insert("card");
        trie.insert("care");
        trie.insert("careful");
        trie.insert("egg");
        List<String> words = trie.findWords("care");

        System.out.println(words);
    }
}
