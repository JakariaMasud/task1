package org.example.models;

import javax.inject.Inject;

public class Car {
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
    public void start(){
        System.out.println("car is started");
    }
}
