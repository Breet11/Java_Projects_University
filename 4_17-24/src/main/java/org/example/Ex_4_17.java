package org.example;

import java.util.Scanner;

public class Ex_4_17
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int miles;
        int gallons;
        int totalMiles = 0;
        int totalGallons = 0;
        float MilesPerGallon;

        while(true)
        {
            System.out.print("Enter driven miles, or -1 to end program: ");
            miles = input.nextInt();

            if(miles == -1)
            {
                break;
            }

            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            MilesPerGallon = (float)(miles/gallons);
            System.out.printf("Miles per gallon for this trip: %.2f%n", MilesPerGallon);

            totalMiles += miles;
            totalGallons += gallons;

            System.out.printf("Miles per gallon for all trips: %.2f%n%n", (float)(totalMiles/totalGallons));
        }
    }
}