package com.immortals.ds.queue;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularQueue<T> {
    private Node<T> front;
    private Node<T> rear;

    public CircularQueue() {
        front = null;
        rear = null;
    }

    public static void main(String[] args) {
        CircularQueue<Integer> queue = new CircularQueue<>();

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue and print elements
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        // Enqueue more elements
        queue.enqueue(4);
        queue.enqueue(5);

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Enqueue one more element to demonstrate circular behavior
        queue.enqueue(6);

        // Dequeue and print remaining elements
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            rear.next = front; // Make it circular
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front; // Make it circular
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        } else {
            T item = front.data;
            if (front == rear) {
                front = null;
                rear = null;
            } else {
                front = front.next;
                rear.next = front; // Maintain circular structure
            }
            return item;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        } else {
            return front.data;
        }
    }
}
