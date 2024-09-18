package com.udemy;

public class CodingExercisePrintAllFactorsValue {
    public static void printFactors(int number){
        if(number<=0){
            System.out.println("Invalid Value");
            return;
        }
        for (int i=1;i<=number;i++){
            if (number%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
