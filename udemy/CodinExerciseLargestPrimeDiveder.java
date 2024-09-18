package com.udemy;

public class CodinExerciseLargestPrimeDiveder {

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int divider = number;
        boolean prime = true;
        int i = number - 1;
        for (; i > 1; i--) {
            if (number % i == 0) {
                if (i == 2) {
                    return 2;
                }
                for (int j = 2; j < i; j++) {
                    prime = true;

                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                    divider = i;
                }
                if (prime) {
                    return divider;
                }
            }

        }
        return divider;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
    }
}

