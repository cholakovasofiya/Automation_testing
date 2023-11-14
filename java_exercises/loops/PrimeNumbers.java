package com.loops;

public class PrimeNumbers {
    public static void main(String[] args) {

        int count;


        for (int i = 1; i <= 100; i++) {
            count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.print(i + " ");

        }
    }
}


