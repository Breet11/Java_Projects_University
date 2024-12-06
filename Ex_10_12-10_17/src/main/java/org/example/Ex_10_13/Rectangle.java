package org.example.Ex_10_13;

public class Rectangle extends TwoDimensionalShape
{
    private double width;
    private double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return width * height;
    }

    @Override
    public String getDescription()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
