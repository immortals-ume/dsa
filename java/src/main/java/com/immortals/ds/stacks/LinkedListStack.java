package com.immortals.ds.stacks;

import java.util.EmptyStackException;

public class LinkedListStack<T> {
    private Node top;

    public void push(T item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }
}
