package com.immortals;

import java.util.Arrays;

class DotProductDp {
    int[][] dotProductMatrix = new int[505][505];  // Dynamic programming array
    int nums1Size, nums2Size;  // Sizes of nums1 and nums2 arrays

    public int maxDotProduct(int[] nums1, int[] nums2) {
        nums1Size = nums1.length;
        nums2Size = nums2.length;

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // Calculate maximum and minimum values for nums1
        for (int num : nums1) {
            firstMax = Math.max(firstMax, num);
            firstMin = Math.min(firstMin, num);
        }

        // Calculate maximum and minimum values for nums2
        for (int num : nums2) {
            secondMax = Math.max(secondMax, num);
            secondMin = Math.min(secondMin, num);
        }

        // Check special cases where all elements are negative
        if ((firstMax < 0 && secondMin > 0) || (firstMin > 0 && secondMax < 0)) {
            return Math.max(firstMax * secondMin, firstMin * secondMax);
        }

        // Initialize the dot product matrix with 0
        for (int i = 0; i < 505; i++) {
            Arrays.fill(dotProductMatrix[i], 0);
        }

        // Calculate dot products and populate the dot product matrix
        for (int i = nums1Size - 1; i >= 0; i--) {
            for (int j = nums2Size - 1; j >= 0; j--) {
                int currentDotProduct = nums1[i] * nums2[j] + dotProductMatrix[i + 1][j + 1];
                dotProductMatrix[i][j] = Math.max(Math.max(currentDotProduct, dotProductMatrix[i + 1][j]), dotProductMatrix[i][j + 1]);
            }
        }
        return dotProductMatrix[0][0];  // Return the maximum dot product
    }
}