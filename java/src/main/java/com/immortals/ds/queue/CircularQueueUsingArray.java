package com.immortals.ds.queue;

public class CircularQueueUsingArray<T> {
    private final int maxSize;
    private final T[] queueArray;
    private int front;
    private int rear;

    public CircularQueueUsingArray(int size) {
        maxSize = size + 1; // One extra space is required to distinguish between full and empty states.
        queueArray = (T[]) new Object[maxSize];
        front = 0;
        rear = 0;
    }

    public static void main(String[] args) {
        CircularQueueUsingArray<Integer> queue = new CircularQueueUsingArray<>(5);

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
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public int size() {
        return (rear - front + maxSize) % maxSize;
    }

    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            queueArray[rear] = item;
            rear = (rear + 1) % maxSize;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        } else {
            T item = queueArray[front];
            front = (front + 1) % maxSize;
            return item;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        } else {
            return queueArray[front];
        }
    }
}
