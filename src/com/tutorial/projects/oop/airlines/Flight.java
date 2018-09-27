package com.tutorial.projects.oop.airlines;

import com.tutorial.projects.oop.airlines.people.Passenger;
import com.tutorial.projects.oop.airlines.transport.air.CargoAirplane;
import com.tutorial.projects.oop.airlines.transport.air.CivilAirplane;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Flight {
    public static void run() {

        // Create passengers
        Passenger passenger1 = new Passenger("Ivanov Ivan Ivanovich", 80, 180, "Seafood");
        Passenger passenger2 = new Passenger("Petrov Petr Petrovich", 90, 190, "Vegan");
        Passenger passenger3 = new Passenger("Sidorov Sidor Sidorovich", 100, 200, "Meat");
        Passenger passenger4 = new Passenger("Savelyev Seva Sevovich", 70, 140, "Milk");

        // create ArrayList of passengers
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
//        System.out.println(passengers);

        // Create airplanes

        CivilAirplane passengersBort1 = new CivilAirplane("Boeing-747", 50.0, 20.2,
                2, 300);
        CivilAirplane passengersBort2 = new CivilAirplane("Boeing-737", 150, 90,
                1500, 250);
        CargoAirplane cargoBort2 = new CargoAirplane("AN-140", 5000, 500,
                2000, 3000);
        CargoAirplane cargoBort1 = new CargoAirplane("IL-76", 4000, 700,
                1500, 2000);

        // Create ArrayList of airplanes
        //Cargoes

        List<CargoAirplane> cargoes = new ArrayList<>();
        cargoes.add(cargoBort2);
        cargoes.add(cargoBort1);
        cargoes.add(new CargoAirplane("IL-76-a", 3000, 700, 1500, 2000));

        System.out.println(cargoes);

        //Passengers

        List<CivilAirplane> civil = new ArrayList<>();

        civil.add(passengersBort1);
        civil.add(passengersBort2);

        //Sort
        System.out.println("Sorting cargoes by fuel consumption");
        //cargoes.sort(Comparator.comparing(CargoAirplane::getFuelConsumption));

        cargoes.sort(new Comparator<CargoAirplane>() {
            @Override
            public int compare(CargoAirplane o1, CargoAirplane o2) {
                if (o1.getFuelConsumption() < o2.getFuelConsumption()) {
                    return -1;
                } else if (o1.getFuelConsumption() > o2.getFuelConsumption()){
                    return 1;
                }

                return 0;
            }
        });

        System.out.println(cargoes);
        System.out.println("\nSorting civil by capacity");
        civil.sort(Comparator.comparing(CivilAirplane::getPassengerPlacesNumber));
        System.out.println(civil);
        passengers.sort(Comparator.comparing(Passenger::getHeight));

//        Compare to fuelConsumption
        System.out.println("\n\nComparing");
        for (int i = 0; i < cargoes.size(); i++) {
            if (cargoes.get(i).getFuelConsumption() > 150)
                System.out.println("Cargo plane with fuel consumption more, than 150: " + cargoes.get(i));

        }
        for (int j = 0; j < civil.size(); j++) {
            if (civil.get(j).getFuelConsumption() > 100)
                System.out.println("Civil plane with fuel consumption more, than 100: " + civil.get(j));

        }
    }
}
