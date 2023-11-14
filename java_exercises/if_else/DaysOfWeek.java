package com.automation_testing;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();
        switch (dayOfWeek) {
            case "Monday":
                System.out.println("The day is Monday");
                break;
            case "Tuesday":
                System.out.println("The day is Tuesday");
                break;
            case"Wednesday":
                System.out.println("The day is Wednesday");
                break;
            case "Thursday":
                System.out.println("The day is Thursday");
                break;
            case "Friday":
                System.out.println("The day is Friday");
                break;
            case "Saturday":
                System.out.println("The day is Saturday");
                break;
            case "Sunday":
                System.out.println("The day is Sunday");
                break;
            default:
                System.out.println("error");
                break;


        }
    }
}
