package org.example;

import java.util.Scanner;

public class Ex_5_16
{
    public static void main(String [] args)
    {
        int asteriskAmount1 = askToEnter();
        int asteriskAmount2 = askToEnter();
        int asteriskAmount3 = askToEnter();
        int asteriskAmount4 = askToEnter();
        int asteriskAmount5 = askToEnter();

        displayAsterisks(asteriskAmount1);
        displayAsterisks(asteriskAmount2);
        displayAsterisks(asteriskAmount3);
        displayAsterisks(asteriskAmount4);
        displayAsterisks(asteriskAmount5);

    }
    public static int askToEnter()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number between 1 and 30: ");
        int asteriskAmount = input.nextInt();

        while(asteriskAmount<1 || asteriskAmount>30)
        {
            System.out.print("Incorrect! Enter number between 1 and 30: ");
            asteriskAmount = input.nextInt();
        }
        return asteriskAmount;
    }
    public static void displayAsterisks(int asteriskAmount)
    {
        for(int i = 0; i < asteriskAmount; i++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
