package org.example;
import java.util.Scanner;

public class Ex_6_20
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        System.out.printf("The area of circle is: %.2f", circleArea(radius));
    }

    public static double circleArea(double radius)
    {
        return Math.PI*Math.pow(radius,2);
    }
}
