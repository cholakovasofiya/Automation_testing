package com.udemy;

public class BankAccount {
    private static String name;
    private static String email;
    private static double balance;
    private static String accountNumber;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        BankAccount.name = name;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        BankAccount.email = email;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        BankAccount.balance = balance;
    }

    public static String getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(String accountNumber) {
        BankAccount.accountNumber = accountNumber;
    }

    public static double withdrowMoney(double sum) {
        if (sum > balance) {
            System.out.println("Not enough balance");
        }
        return balance -= sum;
    }

    public static void depositeMoney() {

    }
}
