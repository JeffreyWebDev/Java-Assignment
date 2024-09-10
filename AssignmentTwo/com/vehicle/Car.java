public class Car {
    private double speedKph;
    private float fuelLevel;  // Fuel level as a percentage (0.0 to 100.0)
    private int distanceTraveled;

    // This method sets the speed of the car
    public void setSpeed(double speed) {
        this.speedKph = speed;
    }

    // This method sets the fuel level of the car
    public void setFuelLevel(float fuel) {
        this.fuelLevel = fuel;
    }

    // This method simulates driving the car for a given distance
    public void drive(int distance) {
        this.distanceTraveled += distance;
    }

    // This method gets the speed in miles per hour
    public double getSpeedMph() {
        return speedKph / 1.60934;  // Convert speed from Kph to Mph
    }

    // This method gets the distance traveled in kilometers
    public int getDistanceKm() {
        return distanceTraveled / 1000;  // Convert distance from meters to kilometers
    }

    // This method is used to calculate the remaining fuel after driving a given distance
    public int calculateRemainingFuel(double distance) {
        double fuelConsumed = (distance / 1000) * 0.5;  // 0.5% fuel per kilometer
        fuelLevel -= fuelConsumed;
        return (int) fuelLevel;  // It returns the remaining fuel percentage as an integer
    }
}
