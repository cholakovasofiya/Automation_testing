package com.udemy;


public class ChallengeOperators {
    public static void main(String[] args) {


    double firstNum = 20.00;
    double secondNum = 80.00;
    double sumOfTheValues = (firstNum + secondNum) * 100.00;
    double remainder = sumOfTheValues % 40.00;
    System.out.println(remainder);

    boolean isTrue= remainder == 0.00;
        System.out.println(isTrue);
        if(!isTrue){
            System.out.println("got some remainder");
        }
}
}
