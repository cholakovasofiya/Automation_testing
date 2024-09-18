package com.udemy;

public class CodeExerciseSpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){

        long result = Math.round(kilometersPerHour/1.609);
        if(kilometersPerHour < 0){
            return -1;
        }else{
            return result;
        }
    }
    public static void printConversion(double kilometersPerHour){
        long result = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " + result +" mi/h");
        }

    }

    public static void main(String[] args) {

    }
}


