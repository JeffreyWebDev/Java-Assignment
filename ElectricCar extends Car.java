package com.vehicle;

public class ElectricCar extends Car {
    private double batteryLevel;  // Battery level as a percentage (0.0 to 100.0)

    // Method to set the battery level of the car
    public void setBatteryLevel(double battery) {
        this.batteryLevel = battery;
    }

    // Method to get the battery level
    public double getBatteryLevel() {
        return batteryLevel;
    }

    // Override the drive method to decrease battery level as well
    @Override
    public void drive(int distance) {
        super.drive(distance);
        double kilometersDriven = distance / 1000.0;
        batteryLevel -= kilometersDriven * 0.1;  // 1% battery decrease for every 10 kilometers driven
    }
}
