package com.vehicle;

public class Car {
    private double speedKph;  // Speed in kilometers per hour
    private float fuelLevel;  // Fuel level as a percentage (0.0 to 100.0)
    private int distanceTraveled;  // Distance traveled in meters

    // Method to set the speed of the car
    public void setSpeed(double speed) {
        this.speedKph = speed;
    }

    // Method to set the fuel level of the car
    public void setFuelLevel(float fuel) {
        this.fuelLevel = fuel;
    }

    // Method to simulate driving the car for a certain distance
    public void drive(int distance) {
        this.distanceTraveled += distance;
    }

    // Method to get the speed in miles per hour
    public double getSpeedMph() {
        return speedKph / 1.60934;  // Convert speed from Kph to Mph
    }

    // Method to get the distance traveled in kilometers
    public int getDistanceKm() {
        return distanceTraveled / 1000;  // Convert distance from meters to kilometers
    }

    // Method to calculate the remaining fuel after driving a given distance
    public int calculateRemainingFuel(double distance) {
        double fuelConsumed = (distance / 1000) * 0.5;  // 0.5% fuel per kilometer
        fuelLevel -= fuelConsumed;
        return (int) fuelLevel;  // Return remaining fuel percentage as an integer
    }
}
