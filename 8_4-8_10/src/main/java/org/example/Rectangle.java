package org.example;

public class Rectangle
{
    private double length;
    private double width;

    public Rectangle()
    {
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double length, double width)
    {
        this.width = width;
        this.length = length;
    }

    public void setLength(double length)
    {
        if(length > 0.0 && length < 20.0)
        {
            this.length = length;
        } else
        {
            throw new IllegalArgumentException("The argument must be more than 0.0 and less than 20!");
        }
    }

    public void setWidth(double width)
    {
        if(width > 0.0 && width < 20.0)
        {
            this.width = width;
        } else
        {
            throw new IllegalArgumentException("The argument must be more than 0.0 and less than 20!");
        }
    }

    public double getLength()
    {
        return this.length;
    }

    public double getWidth()
    {
        return this.width;
    }

    public double calcPerimeter()
    {
        return 2 * (this.length + this.width);
    }

    public double calcArea()
    {
        return this.length * this.width;
    }
}
