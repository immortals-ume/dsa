package com.immortals.ds.tree;

/**
 * implemenntation of Radix tree
 */

import java.util.HashMap;
import java.util.Map;

public class RadixTree {
    private final Node root;

    public RadixTree() {
        root = new Node();
    }

    public static void main(String[] args) {
        RadixTree radixTree = new RadixTree();
        radixTree.insert("apple");
        radixTree.insert("app");
        radixTree.insert("banana");

        System.out.println(radixTree.search("apple"));    // true
        System.out.println(radixTree.search("app"));      // true
        System.out.println(radixTree.search("banana"));   // true
        System.out.println(radixTree.search("orange"));   // false
    }

    // Insert a string into the radix tree
    public void insert(String word) {
        insertRecursive(root, word, 0);
    }

    private void insertRecursive(Node current, String word, int index) {
        if (index == word.length()) {
            current.isEndOfWord = true;
            return;
        }

        char ch = word.charAt(index);
        Node node = current.children.get(ch);
        if (node == null) {
            node = new Node();
            current.children.put(ch, node);
        }

        insertRecursive(node, word, index + 1);
    }

    // Search for a string in the radix tree
    public boolean search(String word) {
        return searchRecursive(root, word, 0);
    }

    private boolean searchRecursive(Node current, String word, int index) {
        if (index == word.length()) {
            return current.isEndOfWord;
        }

        char ch = word.charAt(index);
        Node node = current.children.get(ch);
        if (node == null) {
            return false;
        }

        return searchRecursive(node, word, index + 1);
    }

    // Node class for the radix tree
    private class Node {
        private final Map<Character, Node> children;
        private boolean isEndOfWord;

        public Node() {
            children = new HashMap<>();
            isEndOfWord = false;
        }
    }
}
