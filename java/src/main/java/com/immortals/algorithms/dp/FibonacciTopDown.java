package com.immortals.algorithms.dp;

import java.util.Arrays;

public class FibonacciTopDown {
    public static int fibonacci(int n, int[] memo) {
        // Base case
        if (n <= 1) {
            return n;
        }

        // Check if the result is already memoized
        if (memo[n] != -1) {
            return memo[n];
        }

        // Calculate Fibonacci recursively
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10; // Change n to the desired Fibonacci number you want to calculate
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        int result = fibonacci(n, memo);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
