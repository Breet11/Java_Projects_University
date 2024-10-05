package org.example;

import java.util.Scanner;

public class Ex_5_11
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount of integers: ");
        int amount = input.nextInt();

        while(amount <= 0)
        {
            System.out.print("You must enter for at least 1 number!");
            amount = input.nextInt();
        }

        System.out.print("Enter a number: ");
        int smallest = input.nextInt();

        for(int i = 0; i < amount - 1; i++)
        {
            System.out.print("Enter a number: ");
            int temp = input.nextInt();

            if(temp < smallest)
            {
                smallest = temp;
            }
        }

        System.out.printf("Smallest number: %d%n", smallest);
    }
}