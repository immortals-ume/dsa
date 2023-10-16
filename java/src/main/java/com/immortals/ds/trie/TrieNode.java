package com.immortals.ds.trie;

public class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26]; // Assuming lowercase English letters
        isEndOfWord = false;
    }
}