package com.automation_testing;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if(number >= 0){
            System.out.println("The number: " + number + " is positive!");
        }
        else {
            System.out.println("The number: " + number + " is negative!");
        }
    }
}
