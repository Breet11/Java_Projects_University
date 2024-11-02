package org.example;

import java.util.Scanner;
import java.util.Random;

public class Ex_6_29
{
    public static void main(String[] args)
    {
        enum Coin {heads, tails};

        int headsCount = 0;
        int tailsCount = 0;

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int choice;

        while(true)
        {
            System.out.println("1: Toss Coin");
            System.out.println("2: Display results");
            System.out.println("-1: To exit");

            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                    Coin result;
                    if(random.nextBoolean())
                    {
                        result = Coin.heads;
                    } else
                    {
                        result = Coin.tails;
                    }

                    System.out.printf("Coin toss result is: %s%n", result);

                    if(result == Coin.heads)
                    {
                        headsCount++;
                    } else
                    {
                        tailsCount++;
                    }
                    break;

                case 2:
                    System.out.println("Results: ");
                    System.out.printf("Heads: %d%n", headsCount);
                    System.out.printf("Tails: %d%n", tailsCount);
                    break;

                default:
                    System.out.println("Invalid choice! ");
            }
        }

    }
}
