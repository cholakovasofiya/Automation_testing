package com.udemy;

public class CodingExerciseIsSameLastDigit {
    public static boolean hasSameLastDigit(int a, int b, int c){
        boolean isRangeValid = isValid(a)&&isValid(b)&&isValid(c);
        if(!isRangeValid){
            return false;
        }
        boolean isSame = (a%10==b%10)||(a%10==c%10)||(b%10==c%10);
        if(isSame){
            return true;
        }return false;
    }
    public static boolean isValid(int a){
        if(((a>=10)&&(a<=1000))){
            return true;
        }
        return false;
    }
}
