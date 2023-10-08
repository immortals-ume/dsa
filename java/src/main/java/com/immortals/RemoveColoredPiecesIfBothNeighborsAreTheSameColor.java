package com.immortals;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoveColoredPiecesIfBothNeighborsAreTheSameColor {
    static Logger logger = Logger.getLogger(RemoveColoredPiecesIfBothNeighborsAreTheSameColor.class.getName());

    private RemoveColoredPiecesIfBothNeighborsAreTheSameColor() {
        throw new IllegalStateException("RemoveColoredPiecesIfBothNeighborsAreTheSameColor class");
    }

    public static boolean winnerOfGame(String colors) {
        int n = colors.length();
        if (n <= 2) return false;

        int a1 = 0;
        int b1 = 0;

        for (int i = 1; i < n - 1; i++) {
            char ch = colors.charAt(i);
            char a = colors.charAt(i - 1);
            char b = colors.charAt(i + 1);
            if (ch == 'A' && ch == a && ch == b) a1++;
            if (ch == 'B' && ch == a && ch == b) b1++;
        }
        return a1 > b1;

    }

    public static void main(String[] args) {
        if (logger.isLoggable(Level.INFO)) {
            logger.log(Level.INFO, String.valueOf(winnerOfGame("AAABABB")));
        }
    }
}
