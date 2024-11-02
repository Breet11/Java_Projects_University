package org.example;

public class Ex_6_15
{
    public static void main(String[] args)
    {
        System.out.printf("hypotenuse of first triangle: %.2f%n",hypotenuse(3.0, 4.0));
        System.out.printf("hypotenuse of second triangle: %.2f%n", hypotenuse(5.0, 12.0));
        System.out.printf("hypotenuse of third triangle: %.2f%n", hypotenuse(8.0, 15.0));

    }

    public static double hypotenuse(double firstSide, double secondSide)
    {
        return Math.sqrt(Math.pow(firstSide,2) + Math.pow(secondSide,2));
    }
}
