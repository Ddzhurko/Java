package com.tutorial.tasks.oop.airlines.people;

/**
 * @author Denys Dzhurko
 */
public class AirportEmployee extends Person {

    private double salary;

    public AirportEmployee(String fullName, int weight, int height, double salary) {
        super(fullName, weight, height);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "AirportEmployee: " + getFullName() + ", height" + getHeight() + ", weight: " + getWeight()
                + ", salary: " + salary;
    }
}
