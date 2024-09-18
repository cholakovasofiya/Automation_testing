package com.udemy;

public class CodingExerciseIsLeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            boolean divisibleByFour = year % 4 == 0;
            boolean divisibleByFourHundred = year % 400 == 0;
            boolean divisibleByHundred = year % 100 == 0;
            if (divisibleByFour && !divisibleByHundred) {
                return true;
            } else if (divisibleByFourHundred && divisibleByHundred) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
