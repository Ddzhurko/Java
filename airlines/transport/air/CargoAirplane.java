package com.tutorial.tasks.oop.task9Change.airlines.transport.air;

public class CargoAirplane extends Airplane {

    private static final double CARGO_COEFFICIENT = 0.05;
    private double cargoWeight;

    public CargoAirplane(String name, int fuelConsumption, double enginePower, int engineNumber, double cargoWeight) {
        super(name, fuelConsumption, enginePower, engineNumber);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double getFuelConsumption() {
        return super.getFuelConsumption();
    }

    @Override
    public double getEnginePower(){
        return super.getEnginePower();
    }

    @Override
    public double calculateRentability() {
        final double baseCoefficient = super.calculateRentability();
        return baseCoefficient + CARGO_COEFFICIENT * cargoWeight;
    }

    @Override
    public String toString() {
        return "Bort: " + getName() + " carrying: " + cargoWeight + " fuel consumption: " + getFuelConsumption();
    }
}
