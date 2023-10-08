package com.immortals.ds.queue;

public class PriorityQueue<T extends Comparable<T>> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] heap;
    private int size;

    public PriorityQueue() {
        heap = (T[]) new Comparable[DEFAULT_CAPACITY];
        size = 0;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        minQueue.insert(5);
        minQueue.insert(2);
        minQueue.insert(8);
        minQueue.insert(1);

        while (!minQueue.isEmpty()) {
            int min = minQueue.extractMin();
            System.out.println("Dequeued: " + min);
        }
    }

    public void insert(T item) {
        if (size >= heap.length - 1) {
            // Resize the array if necessary
            resize();
        }

        size++;
        int index = size;
        while (index > 1 && item.compareTo(heap[index / 2]) < 0) {
            heap[index] = heap[index / 2];
            index = index / 2;
        }
        heap[index] = item;
    }

    public T extractMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }

        T min = heap[1];
        heap[1] = heap[size];
        size--;
        heapify(1);

        return min;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        T[] newHeap = (T[]) new Comparable[heap.length * 2];
        System.arraycopy(heap, 1, newHeap, 1, size);
        heap = newHeap;
    }

    private void heapify(int index) {
        int smallest = index;
        int left = 2 * index;
        int right = 2 * index + 1;

        if (left <= size && heap[left].compareTo(heap[smallest]) < 0) {
            smallest = left;
        }

        if (right <= size && heap[right].compareTo(heap[smallest]) < 0) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}

