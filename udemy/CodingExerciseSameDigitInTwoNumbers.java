package com.udemy;

public class CodingExerciseSameDigitInTwoNumbers {

    public static boolean hasSharedDigit(int a, int b){
        boolean numberRange = ((a<10)||(a>99))||((b<10)||(b>99));

        if(numberRange){
            return false;
        }
        int firstDigit1 = a/10;
        int secondDigit1 = a%10;
        int firstDigit2 = b/10;
        int secondDigit2 = b%10;

        boolean samedigit = ((firstDigit1==firstDigit2)||(firstDigit1==secondDigit2))
                ||((secondDigit1==firstDigit2)||(secondDigit1==secondDigit2));
        if(samedigit) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(16, 23));
    }
}

