package com.immortals.algorithms.sorting;

public class InsertionSort {
    public static void insertionSort1DArrayIteratively(int[] arr) {
        insertionSort1D(arr);
        System.out.print("Insertion Sort : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void insertionSort2DArrayIteratively(int[][] arr) {
        insertionSort2D(arr);
        System.out.println("Insertion Sort 2d Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Iterative Approach
    private static void insertionSort2D(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            int[] keyRow = arr[i];
            int j = i - 1;
            while (j >= 0 && keyRow[0] < arr[j][0]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = keyRow;
        }
    }

    /* Move elements of arr[0..i-1], that are
              greater than key, to one position ahead
              of their current position */
    //Iterative Approach
    private static void insertionSort1D(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        InsertionSort.insertionSort1DArrayIteratively(new int[]{23, -23, 911, 874});
        int[][] arr2D = {{5, 4, 7}, {1, 2, 3}, {6, 8, 9}};
        InsertionSort.insertionSort2DArrayIteratively(arr2D);  //using 2D array
    }
}
