package com.errors_and_exeptions;

public class OutOfBoundsException {
    public static void main(String[] args) {
        try {
            String[] animals = {"cat", "dog", "mouse"};
            System.out.println(animals[3]);
        } catch (Exception OutOfBoundsException) {
            assert System.out != null;
            System.out.println("Enter number between 0 and 2");
        }
    }
}

