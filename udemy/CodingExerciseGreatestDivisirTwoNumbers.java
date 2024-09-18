package com.udemy;

import static java.lang.Math.min;

public class CodingExerciseGreatestDivisirTwoNumbers {
    public static int getGreatestCommonDivisor(int first, int second){
        boolean isValidRange = ((first>=10)&&(second>=10));
        if(!isValidRange){
            return -1;
        }
        int i;
        for (i = min(first, second);   i >= 1; i--) {
            if (first % i == 0 && second % i == 0) {
                break;
            }
        }
        return i;
    }

//       public static int getGreatestCommonDivisor(int first, int second) {
//
//        if (first < 10 || second < 10) {
//            return -1;
//        }
//
//        int min = first < second ? first : second;
//        int gcd = 1;
//        for (int j = 1; j <= min; j++) {
//            if (first % j == 0 && second % j == 0) {
//                gcd = j;
//            }
//        }
//        return gcd;
//    }
}
