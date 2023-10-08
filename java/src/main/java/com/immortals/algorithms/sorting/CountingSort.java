package com.immortals.algorithms.sorting;

@SuppressWarnings("ALL")
public class CountingSort {
    public static void countingSort(int[] array) {
        // Find the maximum value in the array to determine the range of counting
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        // Create a counting array to store the count of each element
        int[] countArray = new int[max + 1];

        // Count the occurrences of each element in the input array
        for (int num : array) {
            countArray[num]++;
        }

        // Reconstruct the sorted array from the counting array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                array[index++] = i;
                countArray[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        countingSort(array);

        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
