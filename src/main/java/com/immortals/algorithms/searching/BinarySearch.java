package com.immortals.algorithms.searching;

@SuppressWarnings("ALL")
public class BinarySearch {

    private BinarySearch() {
        throw new IllegalArgumentException();
    }

    //Non Recursive Implementation
    private static int binarySearch(int[] arr, int data) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == data) {
                return mid;
            } else if (arr[mid] < data) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    //Recursive Implementation
    private static int binarySearchRecursive(int[] arr, int low, int high, int data) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == data)
                return mid;
            if (arr[mid] > data)
                return binarySearchRecursive(arr, low, mid - 1, data);
            return binarySearchRecursive(arr, mid + 1, high, data);
        }
        return -1;
    }

    // Recursive Implementation
    public static void searchElementUsingRecursion(int[] arr, int low, int high, int data) {

        int result = binarySearchRecursive(arr, low, high, data);
        if (result != -1) {
            System.out.println("Element is Present At position " + result);
        } else {
            System.out.println("Element is Not Found ");
        }
    }

    public static void searchElement(int[] arr, int data) {
        int result = binarySearch(arr, data);
        if (result != -1) {
            System.out.println("Element is Present At position " + result);
        } else {
            System.out.println("Element is Not Found ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 23, 42, 134, 543};
        BinarySearch.searchElement(arr, 23);

        BinarySearch.searchElementUsingRecursion(arr, 0, arr.length - 1, 263);
    }

}
