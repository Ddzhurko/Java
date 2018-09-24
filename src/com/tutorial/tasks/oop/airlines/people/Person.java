package com.tutorial.tasks.oop.airlines.people;

public abstract class Person {

    private String fullName;
    private int weight;
    private int height;

    public Person(String fullName, int weight, int height) {
        this.fullName = fullName;
        this.weight = weight;
        this.height = height;
    }

    public String getFullName() {
        return fullName;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
