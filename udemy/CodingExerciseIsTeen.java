package com.udemy;

public class CodingExerciseIsTeen {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / (60 * 24);
            long daysRemainder = days % 365;
            long years = days / 365;
            if (years <= 0) {
                System.out.printf("%d min = %d y and %d d", minutes, years, days);
            } else {
                System.out.printf("%d min = %d y and %d d", minutes, years, daysRemainder);
            }
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(3152160);
    }

}



