package com.immortals.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort1DRecursively(int[] arr) {
        sortRecursively(arr);
        System.out.print("Merge Sort Recursively ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mergeSort1DIteratively(int[] arr) {
        sort(arr);
        System.out.println(" ");
        System.out.print("Merge Sort Iteratively ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Recursive Approach for Merge Sort
     *
     * @param array
     */
    private static void sortRecursively(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);
            sortRecursively(left);
            sortRecursively(right);
            merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    /**
     * Merge Sort Iterative Approach
     * <p>
     * why used 2* width as increment in outer loop? <br>
     * <p>
     * The width of the sub-arrays starts at 1 and is doubled at each iteration in the outer for loop.
     * The reason for this is that in each iteration, the sub-arrays are merged in a way that creates larger sub-arrays that are partially sorted.
     * In the next iteration, these larger sub-arrays will be merged again, until all sub-arrays are merged into a single sorted array.
     * <p>
     * The formula for calculating the next width = 2 * width ensures that the width of the sub-arrays increases exponentially,
     * so that the number of iterations required to merge all the sub-arrays into a single sorted array is logarithmic in the size of the input array.
     * This means that the time complexity of the iterative implementation of Merge Sort is O(n * log n), which is the same as the time complexity
     * of the recursive implementation.
     * <p>
     * why used Math.min() in find right index ? <br>
     *
     * <p>
     * The line int right = Math.min(i + 2 * width - 1, array.length - 1) calculates the right index of the current sub-array being merged.
     * <p>
     * The value i + 2 * width - 1 is the index of the end of the right sub-array, assuming that the sub-array extends all the way to the end of the input array.
     * However, it is possible that the right sub-array goes beyond the end of the input array, in which case it needs to be limited to the last
     * index of the input array.
     * <p>
     * The expression Math.min(i + 2 * width - 1, array.length - 1) returns the minimum of the two values, which ensures that the right
     * index of the sub-array never goes beyond the last index of the input array.
     *
     * @param array 1 dimensional Array needs to sorted using merge Sort
     */
    public static void sort(int[] array) {
        for (int width = 1; width < array.length; width = 2 * width) {
            for (int i = 0; i < array.length; i = i + 2 * width) {
                int mid = i + width - 1;
                int right = Math.min(i + 2 * width - 1, array.length - 1);
                merge(array, i, mid, right);
            }
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = array[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = array[j];
            j++;
            k++;
        }
        System.arraycopy(temp, 0, array, left, temp.length);
    }


    public static void sort2DArray(int[][] array) {
        int[] sortedArray = flatten2DArray(array);
        sortedArray = mergeSort(sortedArray);
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sortedArray[k++];
            }
        }
    }

    public static int[] flatten2DArray(int[][] array) {
        int totalElements = 0;
        for (int[] subArray : array) {
            totalElements += subArray.length;
        }

        int[] result = new int[totalElements];
        int k = 0;
        for (int[] subArray : array) {
            for (int element : subArray) {
                result[k++] = element;
            }
        }

        return result;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, mid);
        int[] rightArray = Arrays.copyOfRange(array, mid, array.length);

        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);

        return merge(leftArray, rightArray);
    }

    public static int[] merge(int[] leftArray, int[] rightArray) {
        int[] result = new int[leftArray.length + rightArray.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                result[k++] = leftArray[i++];
            } else {
                result[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            result[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            result[k++] = rightArray[j++];
        }

        return result;
    }


    public static void mergeSortUsing2DArraysRecursively(int[][] arr) {
        sort2DArray(arr);
        System.out.println("Merge Sort for 2D Array");
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MergeSort.mergeSort1DRecursively(new int[]{23, -23, 911, 874});
        MergeSort.mergeSort1DIteratively(new int[]{23, -23, 911, 874});


        int[][] arr2D = {{5, 4, 7}, {1, 2, 3}, {6, 8, 9}};
        MergeSort.mergeSortUsing2DArraysRecursively(arr2D);  //using 2D array
    }
}
