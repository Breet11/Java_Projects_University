package org.example;
import java.util.Scanner;

public class Ex_6_22
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double degrees = 0.0;
        while(true)
        {
            System.out.print("Enter \"1\" for celsius or \"2\" for fahrenheit or \"-1\" to exit:");
            int ManageCase = input.nextInt();
            if(ManageCase == -1)
            {
                break;
            }
            switch(ManageCase)
            {
                case 1: // celsius
                    System.out.print("Enter celsius degrees: ");
                    degrees = input.nextDouble();
                    System.out.printf("Fahrenheit equivalent of celsius is: %.2f%n", fahrenheit(degrees));
                    break;
                case 2:
                    System.out.print("Enter fahrenheit degrees: ");
                    degrees = input.nextDouble();
                    System.out.printf("Celsius equivalent of fahrenheit is: %.2f%n", celsius(degrees));
                    break;
                default:
                    System.out.print("You entered wrong number!");
            }
        }
    }

    public static double celsius(double fahrenheit)
    {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius)
    {
        return (9.0 / 5.0) * celsius + 32;
    }
}
