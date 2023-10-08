package com.immortals;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ReverseString {
    static Logger logger = Logger.getLogger(ReverseString.class.getName());

    private ReverseString() {
        throw new IllegalStateException("ReverseString class");
    }

    public static String reverseWordsStringII(String s) {
        StringBuilder newString = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (s.charAt(0) == ' ') {
                newString.append(ch);
            } else {
                newString.insert(0, ch);
            }
        }
        return newString.toString();
    }

    public static String reverseWordsStringIII(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversed.append(reversedWord).append(" ");
        }
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        if (logger.isLoggable(Level.INFO)) {
            logger.log(Level.INFO, reverseWordsStringII("Let's take LeetCode contest"));
            logger.log(Level.INFO, reverseWordsStringIII("Let's take LeetCode contest"));
        }
    }

}
