package org.example.Ex_10_17;

public class Building implements CarbonFootprint
{
    private double area;

    public Building(double area)
    {
        this.area = area;
    }

    @Override
    public double getCarbonFootprint()
    {
        return area * 0.12;
    }

    @Override
    public String toString()
    {
        return "Building with area: " + area + " square meters";
    }
}


