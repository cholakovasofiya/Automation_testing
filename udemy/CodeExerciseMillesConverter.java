package com.udemy;

public class CodeExerciseMillesConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        long result = Math.round(kilometersPerHour / 1.609);
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(75.114));

    }

}
