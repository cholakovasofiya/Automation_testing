package com.udemy;

public class CodingExerciseEqualDecimalThreePlaces {

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
        int formatedFirstNum = (int) (firstNum * 1000);
        int formatedSecondNum = (int) (secondNum * 1000);

        if (formatedFirstNum == formatedSecondNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.175, -3.1757));
    }
}
