package com.loops;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalStr = scanner.nextLine();
        StringBuilder reversedStr = new StringBuilder();

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr.insert(0, originalStr.charAt(i));
        }

        System.out.println("Reversed string: " + reversedStr);
    }


}

