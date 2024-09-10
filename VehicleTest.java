package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[] args) {
        // Create instances of Car and ElectricCar
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();

        // Initialize the cars using setSpeed and setFuelLevel
        car.setSpeed(120);  // 120 km/h
        car.setFuelLevel(80);  // 80% fuel
        electricCar.setSpeed(100);  // 100 km/h
        electricCar.setFuelLevel(90);  // 90% fuel
        electricCar.setBatteryLevel(100);  // 100% battery

        // Simulate driving both cars
        car.drive(50000);  // Drive 50 kilometers
        electricCar.drive(30000);  // Drive 30 kilometers

        // Display information for the car
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
