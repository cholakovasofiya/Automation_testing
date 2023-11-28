package com.OOP.exercise1;

abstract class Human implements Comparable<Human> {
    private int age;
    private String name;

    @Override
    public int compareTo(Human other) {
        if (this.age < other.age) {
            return -1;
        }
        else if (other.age < this.age) {
            return 1;
        }
        return 0;
    }

    public abstract void work();

    public void sleep() {
        System.out.println("Sleep, you need a rest!");

    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "You are " + name + " at " + age + " years.";
    }
}

class Male extends Human {
    public void work() {
        System.out.println("Go to work!");

    }
}

class Female extends Human {
    public void work() {
        System.out.println("Women don't work! Go shopping!");
    }
}


