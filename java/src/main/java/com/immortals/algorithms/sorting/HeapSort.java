package com.immortals.algorithms.sorting;

/**
 * The heapSort method sorts the input array using the heap sort algorithm.
 * The heapify method is used to maintain the heap property while constructing the heap and during the extraction of elements.
 * The main method demonstrates how to use the heapSort method to sort an array of integers.
 */
@SuppressWarnings("ALL")
public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max-heap from the array
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements one by one from the heap
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (max element) with the current last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify a subtree rooted with the node at index i
    static void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as the root
        int leftChild = 2 * i + 1; // Left child
        int rightChild = 2 * i + 2; // Right child

        // If the left child is larger than the root
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // If the right child is larger than the largest so far
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // If the largest is not the root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        heapSort(arr);

        System.out.println("Sorted Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
