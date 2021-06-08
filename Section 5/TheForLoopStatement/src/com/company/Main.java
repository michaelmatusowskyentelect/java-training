package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2));

        for (int i = 8; i >= 2; i--) {
            System.out.println("10, 000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int primesFound = 0;
        for(int i = 20000000; i < 30000000; i++){
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
                primesFound++;
            }
            if (primesFound == 3)
                break;
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
