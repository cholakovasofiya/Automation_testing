package com.udemy;

public class CodeExerciseBarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (barking){
            if((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay == 23)){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
