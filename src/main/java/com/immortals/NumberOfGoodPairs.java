package com.immortals;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberOfGoodPairs {

    static Logger logger = Logger.getLogger(NumberOfGoodPairs.class.getName());

    private NumberOfGoodPairs() {
        throw new IllegalStateException("NumberOfGoodPairs class");
    }

    public static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] cnt = new int[101];
        for (int a : nums) {
            ans += cnt[a]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        if (logger.isLoggable(Level.INFO)) {
            logger.log(Level.INFO, String.valueOf(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})));
            logger.log(Level.INFO, String.valueOf(numIdenticalPairs(new int[]{1, 1, 1, 1})));
            logger.log(Level.INFO, String.valueOf(numIdenticalPairs(new int[]{1, 2, 3})));
        }
    }
}
