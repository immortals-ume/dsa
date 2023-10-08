package com.immortals.algorithms.sorting;

@SuppressWarnings("ALL")
public class BubbleSort {

    private static void bubbleSortUsing1DArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    swap(arr, j);
                }
    }

    private static void bubbleSortUsing2DArray(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - i - 1; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }


    public static void bubbleSortUsing1DArrays(int[] arr) {
        bubbleSortUsing1DArray(arr);
        System.out.print("Bubble Sort : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void bubbleSortUsing2DArrays(int[][] arr) {
        bubbleSortUsing2DArray(arr);
        System.out.println("Bubble Sort for 2D Array");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr1D = new int[]{23, -23, 911, 874};
        BubbleSort.bubbleSortUsing1DArrays(arr1D);   // using a 1D Array
        int[][] arr2D = {{5, 4, 7}, {1, 2, 3}, {6, 8, 9}};
        BubbleSort.bubbleSortUsing2DArrays(arr2D);  //using 2D array
    }
}
