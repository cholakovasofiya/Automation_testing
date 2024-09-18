package com.udemy;

public class CodingExerciseIsLeapYearPrintMonth {
    public static boolean isLeapYear(int year){

        if((year <1) || (year >9999)){
            return false;
        }
        boolean isLeap = ((year%100==0)&&(year%400==0))||((year%4==0)&&(year%100!=0));
        return isLeap;
    }


    public static int getDaysInMonth(int month, int year) {
        boolean isValidRange = ((year >= 1) && (year <= 9999));
        if (isValidRange) {
            return switch (month) {
                case 1, 8, 10, 7, 5, 3, 12 -> 31;
                case 2 -> {
                    if (isLeapYear(year)) {
                        yield 29;
                    } else {
                        yield 28;
                    }
                }
                case 4, 11, 6, 9 -> 30;
                default -> -1;
            };
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int result = getDaysInMonth(2,2020);
        System.out.println(result);
    }
}
