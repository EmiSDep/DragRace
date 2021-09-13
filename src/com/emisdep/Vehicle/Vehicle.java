package com.emisdep.Vehicle;

import com.emisdep.Engine.Engine;
import com.emisdep.Passenger;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    public String type;
    public Engine engine;
    public boolean isLand;
    public boolean isWater;
    public List<Passenger> passengers = new ArrayList<>();
    public int speed;

    public Vehicle(String type, Engine engine, boolean isLand) {
        this.type = type;
        this.engine = engine;
        this.isLand = isLand;
    }

    public int getSpeed() {
        return speed;
    }

    public void turnOn(Vehicle vehicle) {
        Engine.turnOn(vehicle.engine);
    }

    public void turnOff(Vehicle vehicle) {
        Engine.turnOff(vehicle.engine);
    }

    public abstract void addPassenger(Passenger passenger);

    public abstract void removePassenger(Passenger passenger);

    public abstract void accelerate();

    public abstract void braking();

    public abstract void coast();

    public String toString() {
        String output = "Type: " + type;
        return output;
    }
}
