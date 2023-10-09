package com.immortals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomStringListShuffle {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Fig");

        // Create a Random object
        Random random = new Random();

        // Shuffle the list using custom random shuffling
        for (int i = stringList.size() - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);

            // Swap elements at randomIndex and i
            String temp = stringList.get(i);
            stringList.set(i, stringList.get(randomIndex));
            stringList.set(randomIndex, temp);
        }

        // Print the shuffled list
        System.out.println("Shuffled List of Strings: " + stringList);
    }
}
