package com.emisdep;

import com.emisdep.Engine.Gas;
import com.emisdep.Vehicle.Car;
import com.emisdep.Vehicle.Vehicle;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Passenger Emilio = new Passenger("Emilio");
        Vehicle car = new Car("Toyota", new Gas(), true);

        car.addPassenger(Emilio);
        car.turnOn(car);
       // car.removePassenger(Emilio);
        System.out.println(car.toString());
    }
}
