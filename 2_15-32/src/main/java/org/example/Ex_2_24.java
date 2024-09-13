package org.example;

import java.util.Scanner;

public class Ex_2_24
{
    public static void main(String [] args)
    {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first int: ");
        num1 = input.nextInt();

        System.out.print("Enter second int: ");
        num2 = input.nextInt();

        System.out.print("Enter third int: ");
        num3 = input.nextInt();

        System.out.print("Enter fourth int: ");
        num4 = input.nextInt();

        System.out.print("Enter fifth int: ");
        num5 = input.nextInt();

        System.out.print("\n");

        int min = num1;
        int max = num1;

        if (num2 > max)
        {
            max = num2;
        } else if (num2 < min)
        {
            min = num2;
        }

        if (num3 > max)
        {
            max = num3;
        } else if (num3 < min)
        {
            min = num3;
        }

        if (num4 > max)
        {
            max = num4;
        } else if (num4 < min)
        {
            min = num4;
        }

        if (num5 > max)
        {
            max = num5;
        } else if (num5 < min)
        {
            min = num5;
        }

        System.out.printf("The largest number is: %d%n", max);
        System.out.printf("The smallest number is: %d%n", min);

    }
}
