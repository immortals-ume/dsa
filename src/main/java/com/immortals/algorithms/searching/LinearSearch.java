package com.immortals.algorithms.searching;

@SuppressWarnings("ALL")
public class LinearSearch {
    private static int linearSearch(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public static void searchElement(int[] arr, int data) {
        int result = linearSearch(arr, data);
        if (result != -1) {
            System.out.println("Element is Present At position " + result);
        } else {
            System.out.println("Element is Not Found ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 23, 42, 134, 543};
        LinearSearch.searchElement(arr, 23);
        LinearSearch.searchElement(arr, 223);
    }

}
