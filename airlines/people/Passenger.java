package com.tutorial.tasks.oop.task9Change.airlines.people;

public class Passenger extends Person {

    private String favouriteFood;

    public Passenger(String fullName, int weight, int height, String favouriteFood) {
        super(fullName, weight, height);
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    @Override
    public String toString() {
        return "Passenger: " + getFullName() + ", weight: " + getWeight() + ", height: " + getHeight()
                + ", favourite food: " + favouriteFood;
    }
}

