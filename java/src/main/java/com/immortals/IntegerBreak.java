package com.immortals;


import java.util.logging.Level;
import java.util.logging.Logger;

public class IntegerBreak {

    static Logger logger = Logger.getLogger(IntegerBreak.class.getName());

    private IntegerBreak() {
        throw new IllegalStateException("Integer Break class");
    }

    public static int integerBreak(int n) {
        if (n <= 3) {
            return n - 1; // For n = 2 or 3, the maximum product is n - 1
        }

        int product = 1;

        while (n > 4) {
            product *= 3;
            n -= 3;
        }

        product *= n; // Multiply the remaining n (which will be 2 or 3) to the product

        return product;
    }


    public static void main(String[] args) {
        if (logger.isLoggable(Level.INFO)) {
            logger.log(Level.INFO, String.valueOf(integerBreak(23)));
        }
    }
}
