package com.immortals.algorithms.dp;

public class FibonacciBottomUp {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10; // Change n to the desired Fibonacci number you want to calculate

        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
