package com.errors_and_exeptions;


public class UncheckedExceptions {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[6]);
        } catch (Exception e) {
            assert System.out != null;
            System.out.println("You need to print up to 4");
        }


    }
}
