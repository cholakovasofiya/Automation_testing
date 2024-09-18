package com.udemy;

public class CodingExerciseIsPalindromeNumber {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int duplicatedNumber = Math.abs(number);
        int i = 10;
        while (duplicatedNumber > 0) {
            reverse = (reverse * i) + (duplicatedNumber % 10);
            duplicatedNumber /= 10;

        }
        if (reverse == Math.abs(number)) {

            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrome(123456);
    }

}



