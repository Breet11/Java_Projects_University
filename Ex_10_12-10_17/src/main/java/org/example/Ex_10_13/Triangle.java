package org.example.Ex_10_13;

public class Triangle extends TwoDimensionalShape
{
    private double side;

    public Triangle(double side)
    {
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return (Math.sqrt(3) * side * side) / 4;
    }

    @Override
    public String getDescription()
    {
        return "Equilateral triangle with side = " + side;
    }
}
