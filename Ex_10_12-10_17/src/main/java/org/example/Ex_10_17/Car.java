package org.example.Ex_10_17;

public class Car implements CarbonFootprint
{
    private double fuelConsumption;
    private double distanceTraveled;

    public Car(double fuelConsumption, double distanceTravelled)
    {
        this.distanceTraveled = distanceTravelled;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double getCarbonFootprint()
    {
        return (fuelConsumption * distanceTraveled / 100) * 2.3;
    }

    @Override
    public String toString()
    {
        return "Car with fuel consumption: " + fuelConsumption + " liters/100km, distance traveled: "
                + distanceTraveled + " km";
    }
}
