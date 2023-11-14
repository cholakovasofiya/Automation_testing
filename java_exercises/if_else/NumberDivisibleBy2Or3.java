package com.automation_testing;
//2. Create a small piece of code (method), which accepts an integer and writes to the console
// is the integer divisible by 2 without reminder,
// if not - is it divisible by 3 without reminder,
// or it is not divisible by 2 nor by 3.

import java.util.Scanner;

public class NumberDivisibleBy2Or3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 2 == 0) {
            if (number % 3 == 0) {
                System.out.println("The number is  divisible by 2 and by 3!");
            } else {
                System.out.println("The number is  divisible only by 2!");
            }

        } else if (number % 3 == 0) {
            System.out.println("The number is divisible only by 3");
        } else {
            System.out.println("The number is not divisible by 2 nor by 3!");
        }


    }
}

