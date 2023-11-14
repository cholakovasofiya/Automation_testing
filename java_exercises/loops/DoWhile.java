package com.loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String command;

        int sumNumbers = 0;
        do {
            sumNumbers += number1 +number2;
            System.out.println(sumNumbers);
            command = scanner.nextLine();
        }while (command.equals("Yes"));

        System.out.println("The final sum of your numbers is: "+sumNumbers);
    }
}
