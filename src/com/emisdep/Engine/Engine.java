package com.emisdep.Engine;

public abstract class Engine {
    public String type;
    public boolean isOn;
    public boolean gas = false;
    public int accelerationRate;
    public int max;

    public int getMax() {
        return max;
    }

    public int getAccelerationRate() {
        return accelerationRate;
    }

    public static void turnOn(Engine engine) {
        engine.isOn = true;
    }

    public static void turnOff(Engine engine) {
        engine.isOn = false;
    }

}
