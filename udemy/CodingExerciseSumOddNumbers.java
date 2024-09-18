package com.udemy;

public class CodingExerciseSumOddNumbers {
    public static boolean isOdd(int number){
        boolean validRange = number >0;
        if(!validRange){
            return false;
        }
        if(number%2!=0){
            return true;
        }else{
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        boolean validRange = (start>0)&&(start<=end);
        if(!validRange){
            return -1;
        }
        int sumOddNumbers=0;
        for(int i = start;i<=end;i++){
            if(isOdd(i)){
                sumOddNumbers+=i;
            }

        }return sumOddNumbers;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1,11));
    }
}



