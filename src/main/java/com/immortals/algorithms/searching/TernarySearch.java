package com.immortals.algorithms.searching;

@SuppressWarnings("ALL")
public class TernarySearch {
    private static int ternarySearch(int[] arr, int data) {
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            if (arr[mid1] == data) {
                return mid1;
            }
            if (arr[mid2] == data) {
                return mid2;
            }
            if (data < arr[mid1]) {
                high = mid1 - 1;
            } else if (data > arr[mid2]) {
                low = mid2 + 1;
            } else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        return -1;
    }

    //Recursive Implementation
    private static int ternarySearchRecursive(int[] arr, int low, int high, int data) {
        while (high >= low) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            if (arr[mid1] == data) {
                return mid1;
            }
            if (arr[mid2] == data) {
                return mid2;
            }
            if (data < arr[mid1]) {
                return ternarySearchRecursive(arr, low, mid1 - 1, data);
            } else if (data > arr[mid2]) {
                return ternarySearchRecursive(arr, mid2 + 1, high, data);
            } else {
                return ternarySearchRecursive(arr, mid1 + 1, mid2 - 1, data);
            }
        }
        return -1;
    }

    // Recursive Implementation
    public static void searchElementUsingRecursion(int[] arr, int low, int high, int data) {

        int result = ternarySearchRecursive(arr, low, high, data);
        if (result != -1) {
            System.out.println("Element is Present At position " + result);
        } else {
            System.out.println("Element is Not Found ");
        }
    }

    //Iterative Implementation
    public static void searchElement(int[] arr, int data) {
        int result = ternarySearch(arr, data);
        if (result != -1) {
            System.out.println("Element is Present At position " + result);
        } else {
            System.out.println("Element is Not Found ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 23, 42, 134, 543};
        TernarySearch.searchElement(arr, 23);

        TernarySearch.searchElementUsingRecursion(arr, 0, arr.length - 1, 263);
    }
}
