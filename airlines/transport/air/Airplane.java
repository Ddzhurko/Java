package com.tutorial.tasks.oop.task9Change.airlines.transport.air;

import com.tutorial.tasks.oop.task9Change.airlines.Rentability;
import com.tutorial.tasks.oop.task9Change.airlines.transport.Transport;
import com.tutorial.tasks.oop.task9Change.airlines.transport.TransportType;

public abstract class Airplane extends Transport implements Flyable, Rentability {

    private static final double BASE_AIRPLANE_RENTABILITY_COEFFICIENT = 0.7;
    private int engineNumber;

    public Airplane(String name, double fuelConsumption, double enginePower, int engineNumber) {
        super(name, fuelConsumption, enginePower, TransportType.AIRPLANE);
        this.engineNumber = engineNumber;
    }

    @Override
    public double getFuelConsumption() {
        return super.getFuelConsumption();
    }

    @Override
    public double getEnginePower(){
        return super.getEnginePower();
    }

    public double calculateRentability() {
        return BASE_AIRPLANE_RENTABILITY_COEFFICIENT * engineNumber;
    }

    public void fly(double distance) {
        System.out.println(this + " is flying for " + distance);
    }
}
