package com.OOP.exercise1;

public class Main {
    public static void main(String[] args) {
        Human newHuman = new Male();
        newHuman.setAge(18);
        newHuman.setName("Jack");
        System.out.println(newHuman.toString());
        newHuman.work();

    }
}
