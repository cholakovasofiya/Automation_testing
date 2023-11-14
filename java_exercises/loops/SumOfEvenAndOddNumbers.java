package com.loops;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfEvenAndOddNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] array = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        int sumEvenNumbers = 0;
//        int sumOddNumbers = 0;
//        for (int index : array) {
//            if (index % 2 == 0) {
//                sumEvenNumbers += index;
//            } else {
//                sumOddNumbers += index;
//
//            }
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int countNumbersInput = scanner.nextInt();
        for (int i = 0; i < countNumbersInput; i++) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                sumEvenNumbers += number;
            }
            else {
                sumOddNumbers += number;
            }

        }

            System.out.println(("The sum of even numbers is: " + sumEvenNumbers));
            System.out.println(("The sum of odd numbers is: " + sumOddNumbers));
}

}


