package com.udemy.encapsulation;

public class Customer {
    private static String name;
    private static String email;
    private static double creditLimit ;

    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;

    }
    public Customer (){
        this("NoName","no@mail");
    }

    public Customer(String name,String email){
        this(name, email,0.0);
    }
    public  String getName() {
        return name;
    }

    public  String getEmail() {
        return email;
    }

    public  double getCreditLimit() {
        return creditLimit;
    }
}
