package com.immortals;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FindFirstandLastPositionOfElementInSortedArray {

    static Logger logger = Logger.getLogger(FindFirstandLastPositionOfElementInSortedArray.class.getName());


    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};

        // Find the leftmost occurrence of the target
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Reset left and right pointers for finding the rightmost occurrence
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        if (logger.isLoggable(Level.INFO)) {

            logger.log(Level.INFO, Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
            logger.log(Level.INFO, Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
            logger.log(Level.INFO, Arrays.toString(searchRange(new int[]{}, 0)));


        }
    }

}
