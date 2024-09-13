package org.example;

import java.util.Scanner;

public class Ex_2_16
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x;
        int y;

        System.out.print("Enter first int (x): ");
        x = input.nextInt();

        System.out.print("Enter second int (y): ");
        y = input.nextInt();

        if (x > y)
        {
            System.out.print("x is larger ");
        } else if (x < y)
        {
            System.out.print("y is larger ");
        } else
        {
            System.out.print("These numbers are equal");
        }
    }
}
