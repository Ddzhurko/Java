package com.tutorial.projects.oop.airlines.transport;

public abstract class Transport {

    private String name;
    private double fuelConsumption;
    private double enginePower;
    private TransportType transportType;

    public Transport(String name, double fuelConsumption, double enginePower, TransportType transportType) {
        this.name = name;
        this.fuelConsumption = fuelConsumption;
        this.enginePower = enginePower;
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public TransportType getTransportType() {
        return transportType;
    }
}
