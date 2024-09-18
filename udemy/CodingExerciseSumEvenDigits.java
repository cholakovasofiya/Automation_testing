package com.udemy;

public class CodingExerciseSumEvenDigits {

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int reminder = number%10;
        int sumEvenDigits = 0;
        while(number>0){
            if(reminder%2==0){
                sumEvenDigits+=reminder;
            }
            number/=10;
            reminder=number%10;
        }

        return sumEvenDigits;
    }
//    public static int getEvenDigitSum(int number) {
//
//        if (number < 0) {
//            return -1;
//        }
//
//        int sum = 0;
//        for (int i = number; i > 0; i /= 10) {
//            int lastDigit = i % 10;
//            if (lastDigit % 2 == 0) {
//                sum += lastDigit;
//            }
//        }

        // == alternative using while loop ==
        // while (number > 0) {
        //     int lastDigit = number % 10;
        //     if (lastDigit % 2 == 0) {
        //         sum += lastDigit;
        //     }
        //     number /= 10;
        // }

//        return sum;
//    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(5));
    }
}




