package com.sandhyaenugonda.prime;

/**
 * Utility to check whether a number is prime.
 */
public final class PrimeChecker {

    private PrimeChecker() {
        // utility class
    }

    /**
     * Returns true if n is prime, false otherwise.
     * Handles negative numbers, 0 and 1 (non-prime).
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        // check 6k +/- 1 up to sqrt(n)
        for (int i = 5; (long) i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
