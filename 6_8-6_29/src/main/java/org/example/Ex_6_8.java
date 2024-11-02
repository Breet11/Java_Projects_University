package org.example;
import java.util.Scanner;

public class Ex_6_8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double totalCharges = 0.0;

        while (true)
        {
            System.out.print("Enter hours parked, or -1 to exit: ");
            int hoursParked = input.nextInt();

            if (hoursParked == -1)
            {
                break;
            }
            double charges = calculateCharges(hoursParked);
            totalCharges += charges;

            System.out.printf("Client's charges: %.2f%n", charges);
        }
        System.out.printf("Total revenue: %.2f%n%n", totalCharges);

    }
    public static double calculateCharges(int hoursParked)
    {
        double baseRate = 2.00;
        double hourRate = 0.50;
        double maxRate = 10.00;

        if (hoursParked <=3)
        {
            return baseRate;
        } else
        {
            double additionalCharges = (hoursParked - 3) * hourRate;
            double totalCharges = baseRate + additionalCharges;

            if(totalCharges > maxRate)
            {
                return maxRate;
            } else
            {
                return totalCharges;
            }
        }
    }
}