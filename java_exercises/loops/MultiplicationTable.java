package com.loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i<= number;i++){
            for(int j= 1; j<=10;j++){
                int multipleSum = i*j;
                System.out.println(i+"*"+j+"="+multipleSum);
            }
        }
    }
}
