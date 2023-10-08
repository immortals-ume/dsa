package com.immortals.ds.queue;

import java.util.NoSuchElementException;

public class Deque<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Deque() {
        front = null;
        rear = null;
        size = 0;
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();

        deque.addFront(1);
        deque.addRear(2);
        deque.addFront(3);

        System.out.println("Front: " + deque.peekFront()); // Should print "Front: 3"
        System.out.println("Rear: " + deque.peekRear());   // Should print "Rear: 2"

        deque.removeFront();
        System.out.println("Front after removal: " + deque.peekFront()); // Should print "Front after removal: 1"
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFront(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void addRear(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T removeFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }

        T removedItem = front.data;
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null; // Deque is now empty
        }
        size--;
        return removedItem;
    }

    public T removeRear() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }

        T removedItem = rear.data;
        rear = rear.prev;
        if (rear != null) {
            rear.next = null;
        } else {
            front = null; // Deque is now empty
        }
        size--;
        return removedItem;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return front.data;
    }

    public T peekRear() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return rear.data;
    }

    private class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
