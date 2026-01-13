package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String name;
    private double height;
    private double weight;
    private int speed;
    private int armor;
    private int strength;

    public Jaeger() {
    }

    public Jaeger(String name, double height, double weight, int speed, int armor, int strength) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Имя робота не может быть пустым");
        }
        this.name = name.trim();
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.armor = armor;
        this.strength = strength;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Имя робота не может быть пустым");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
}