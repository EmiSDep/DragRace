package com.emisdep.Vehicle;

import com.emisdep.Engine.Engine;
import com.emisdep.Passenger;
import com.emisdep.Vehicle.Vehicle;

public class Car extends Vehicle {

    public Car(String type, Engine engine, boolean isLand) {
        super(type, engine, isLand);
    }


    public static void turnOn(Engine engine) {
        engine.isOn = true;
    }

    public static void turnOff(Engine engine) {
        engine.isOn = false;
    }


    @Override
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    @Override
    public void removePassenger(Passenger passenger) {
      passengers.remove(passenger);
    }

    @Override
    public void accelerate() {
    if (speed < engine.getMax()) {
        speed += engine.getAccelerationRate();
        System.out.println("Accelerating at.. " + speed + "mph");
    } else if (speed > engine.getMax()) {
        speed = engine.getMax();
        System.out.println("Going at max.");
    }

    }

    @Override
    public void braking() {

    }

    @Override
    public void coast() {

    }
}
