package com.immortals;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

class MInOperations {
    static Logger logger = Logger.getLogger(MInOperations.class.getName());

    public static int minOperations(int[] nums) {
        Arrays.sort(nums);
        int count = Integer.MAX_VALUE, j = 1, dup = 0;
        int[] dupArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && nums[j] <= nums[i] + nums.length - 1) {
                if (nums[j] == nums[j - 1]) ++dup;
                dupArr[j] = dup;
                j++;
            }
            count = Math.min(count, i + (nums.length - j) + dup - dupArr[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        if (logger.isLoggable(Level.INFO)) {
            logger.log(Level.INFO, String.valueOf(minOperations(new int[]{1, 2, 3, 1, 1, 3})));
            logger.log(Level.INFO, String.valueOf(minOperations(new int[]{1, 1, 1, 1})));
            logger.log(Level.INFO, String.valueOf(minOperations(new int[]{1, 2, 3})));
            logger.log(Level.INFO, String.valueOf(minOperations(new int[]{1, 2})));
            logger.log(Level.INFO, String.valueOf(minOperations(new int[]{3})));
            logger.log(Level.INFO, String.valueOf(minOperations(new int[]{3, 2, 3})));
        }
    }
}