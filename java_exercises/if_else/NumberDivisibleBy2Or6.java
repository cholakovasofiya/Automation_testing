package com.automation_testing;

import java.util.Scanner;

public class NumberDivisibleBy2Or6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 2 == 0) {
            if (number % 6 == 0) {
                System.out.println("The number is divisible by 2 and 6!");
            } else {
                System.out.println("The number is divisible only by 2!");
            }
        }
    }
}