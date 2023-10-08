package com.immortals.algorithms.sorting;

@SuppressWarnings("ALL")
public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the partition index and partition the array
            int pivotIndex = partition(array, low, high);

            // Recursively sort the sub-arrays
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        // Choose the pivot element (e.g., the last element in the array)
        int pivot = array[high];

        // Initialize the index of the smaller element
        int i = low - 1;

        // Iterate through the array and rearrange elements
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and the pivot
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the partition index
        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        int n = array.length;

        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        quickSort(array, 0, n - 1);

        System.out.print("\nSorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
