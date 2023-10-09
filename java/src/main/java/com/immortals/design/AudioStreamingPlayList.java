package com.immortals.design;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AudioStreamingPlayList {
    /**
     * audio streaming app , playlist play in Random order
     * [String,String,String ]
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> strings = new java.util.ArrayList<>(List.of("a", "b", "c", "d"));
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            Collections.shuffle(strings);
            getRandomStrings(strings);
            strings.forEach(System.out::println);
        }
    }

    private static List<String> getRandomStrings(List<String> songs) {
        Random random = new Random();
        for (int i = songs.size() - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);

            String temp = songs.get(i);
            songs.set(i, songs.get(randomIndex));
            songs.set(randomIndex, temp);
        }
        return songs;
    }
}