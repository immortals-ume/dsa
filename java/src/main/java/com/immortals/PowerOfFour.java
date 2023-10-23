package com.immortals;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        double x = Math.log(n) / Math.log(4);
        return x == (int) x;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));  // true, 16 is 4^2
        System.out.println(isPowerOfFour(5));   // false, 5 is not a power of 4
    }
}
