package org.example.di;

import dagger.Component;
import org.example.models.Car;

import javax.inject.Singleton;

@Singleton
@Component(modules = VehiclesModule.class)
public interface VehiclesComponent {
    Car buildCar();
}