package com.tutorial.projects.oop.airlines.transport.air;

public class CivilAirplane extends Airplane {

    private static final double PASSENGER_PLACES_COEFFICIENT = 0.1;
    private int passengerPlacesNumber;

    public CivilAirplane(String name, double fuelConsumption, double enginePower, int engineNumber,
                         int passengerPlacesNumber) {
        super(name, fuelConsumption, enginePower, engineNumber);
        this.passengerPlacesNumber = passengerPlacesNumber;
    }

    public int getPassengerPlacesNumber() {
        return passengerPlacesNumber;
    }

    @Override
    public double calculateRentability() {
        final double baseCoefficient = super.calculateRentability();
        return baseCoefficient + passengerPlacesNumber * PASSENGER_PLACES_COEFFICIENT;

    }

    @Override
    public String toString() {
        return "Bort: " + getName() + " passenger places: " + passengerPlacesNumber + " fuel consumption: "
                + getFuelConsumption();
    }
}
