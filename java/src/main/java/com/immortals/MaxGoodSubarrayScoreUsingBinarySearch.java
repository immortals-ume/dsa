package com.immortals;

import java.util.ArrayList;
import java.util.List;

public class MaxGoodSubarrayScoreUsingBinarySearch {
    public static void main(String[] args) {
        MaxGoodSubarrayScoreUsingBinarySearch maxGoodSubarrayScore = new MaxGoodSubarrayScoreUsingBinarySearch();

        // Example 1
        int[] nums1 = {1, 4, 3, 7, 4, 5};
        int k1 = 3;
        System.out.println(maxGoodSubarrayScore.maxScore(nums1, k1));  // Output: 15

        // Example 2
        int[] nums2 = {5, 5, 4, 5, 4, 1, 1, 1};
        int k2 = 0;
        System.out.println(maxGoodSubarrayScore.maxScore(nums2, k2));  // Output: 20
    }

    public int maxScore(int[] nums, int k) {
        return maximumScore(nums, k);
    }

    public int maximumScore(int[] nums, int k) {
        int ans = solve(nums, k);
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }

        return Math.max(ans, solve(nums, nums.length - k - 1));
    }

    public int solve(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[k];
        int currMin = Integer.MAX_VALUE;
        for (int i = k - 1; i >= 0; i--) {
            currMin = Math.min(currMin, nums[i]);
            left[i] = currMin;
        }

        List<Integer> right = new ArrayList<>();
        currMin = Integer.MAX_VALUE;
        for (int i = k; i < n; i++) {
            currMin = Math.min(currMin, nums[i]);
            right.add(currMin);
        }

        int ans = 0;
        for (int j = 0; j < right.size(); j++) {
            currMin = right.get(j);
            int i = binarySearch(left, currMin);
            int size = (k + j) - i + 1;
            ans = Math.max(ans, currMin * size);
        }

        return ans;
    }

    public int binarySearch(int[] nums, int num) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

}
