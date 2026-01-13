package com.startjava.lesson_2_3.person;

public class Person {
    String sex = "Man";
    String name = "Yakov";
    int height = 185;
    int weight = 85;
    int age = 30;

    public void walk() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void speak() {
        System.out.println("Говорит");
    }

    public void learnJava() {
        System.out.println("Учит Java");
    }
}