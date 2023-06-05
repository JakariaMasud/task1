package org.example;


import org.example.di.DaggerVehiclesComponent;
import org.example.di.VehiclesComponent;
import org.example.models.Car;

public class Main {
    public static void main(String[] args) {
        VehiclesComponent component = DaggerVehiclesComponent.create();

        Car bmw = component.buildCar();
        bmw.start();
    }
}