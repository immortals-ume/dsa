package com.immortals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MajorityElementII {

    static Logger logger = Logger.getLogger(MajorityElementII.class.getName());

    private MajorityElementII() {
        throw new IllegalStateException("MajorityElementII class");
    }

    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (int num : nums) {
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }

        return getIntegers(nums, elementCountMap);
    }

    private static List<Integer> getIntegers(int[] nums, Map<Integer, Integer> elementCountMap) {
        List<Integer> majorityElements = new ArrayList<>();
        int threshold = nums.length / 3;

        // Iterate through the frequency map to identify majority elements
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            // Check if the element count is greater than the threshold
            if (count > threshold) {
                majorityElements.add(element);
            }
        }
        return majorityElements;
    }


    public static void main(String[] args) {
        if (logger.isLoggable(Level.INFO)) {
            logger.log(Level.INFO, String.valueOf(majorityElement(new int[]{1, 2, 3, 1, 1, 3})));
            logger.log(Level.INFO, String.valueOf(majorityElement(new int[]{1, 1, 1, 1})));
            logger.log(Level.INFO, String.valueOf(majorityElement(new int[]{1, 2, 3})));
            logger.log(Level.INFO, String.valueOf(majorityElement(new int[]{1, 2})));
            logger.log(Level.INFO, String.valueOf(majorityElement(new int[]{3})));
            logger.log(Level.INFO, String.valueOf(majorityElement(new int[]{3, 2, 3})));
        }
    }
}
