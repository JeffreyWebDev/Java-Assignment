package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[] args) {
        // Creation of instances of Car and ElectricCar
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();

        // Initialization of the cars using setSpeed and setFuelLevel
        car.setSpeed(120);  
        car.setFuelLevel(80);
        electricCar.setSpeed(100);
        electricCar.setFuelLevel(90); 
        electricCar.setBatteryLevel(100); 

        // Simulation of driving both cars
        car.drive(50000); 
        electricCar.drive(30000);

        System.out.println("Car speed in mph: " + car.getSpeedMph());
        System.out.println("Car distance in kilometers: " + car.getDistanceKm());
        System.out.println("Car remaining fuel: " + car.calculateRemainingFuel(50));

        // Display information for the electric car
        System.out.println("Electric car speed in mph: " + electricCar.getSpeedMph());
        System.out.println("Electric car distance in kilometers: " + electricCar.getDistanceKm());
        System.out.println("Electric car remaining fuel: " + electricCar.calculateRemainingFuel(30));
        System.out.println("Electric car remaining battery: " + electricCar.getBatteryLevel());
    }
}
