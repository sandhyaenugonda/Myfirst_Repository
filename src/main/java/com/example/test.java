package com.sandhyaenugonda.prime;

/**
 * Simple CLI to check a single integer argument.
 */
public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java -jar prime-checker.jar <number>");
            System.exit(1);
        }

        try {
            int n = Integer.parseInt(args[0]);
            boolean prime = PrimeChecker.isPrime(n);
            System.out.println(n + (prime ? " is prime" : " is not prime"));
        } catch (NumberFormatException e) {
            System.err.println("Invalid number: " + args[0]);
            System.exit(2);
        }
    }
}
