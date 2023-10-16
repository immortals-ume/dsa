package com.immortals;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberOfWaysToStayInTheSamePlaceAfterSomeSteps {

    static Logger logger = Logger.getLogger(NumberOfWaysToStayInTheSamePlaceAfterSomeSteps.class.getName());

    public static int numWays(int steps, int arrLen) {
        int mod = 1000000007;
        int maxPos = Math.min(steps, arrLen - 1);
        int[][] dp = new int[steps + 1][maxPos + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= steps; i++) {
            for (int j = 0; j <= maxPos; j++) {
                dp[i][j] = dp[i - 1][j]; // Stay in the same place
                if (j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % mod; // Move 1 position to the left
                }
                if (j < maxPos) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % mod; // Move 1 position to the right
                }
            }
        }

        return dp[steps][0];
    }

    public static void main(String[] args) {
        if (logger.isLoggable(Level.INFO)) {
            logger.log(Level.INFO, String.valueOf(numWays(2, 4)));
        }
    }
}
