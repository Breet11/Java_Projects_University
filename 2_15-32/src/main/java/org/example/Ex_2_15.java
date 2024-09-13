package org.example;

import java.util.Scanner;

public class Ex_2_15
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int result;

        System.out.print("Enter first int: ");
        x = input.nextInt();

        System.out.print("Enter second int: ");
        y = input.nextInt();

        result = x * y;
        System.out.printf("The result of multiplication is: %d%n", result);

        result = x + y;
        System.out.printf("The result of sum is: %d%n", result);

        result = x - y;
        System.out.printf("The result of subtraction is: %d%n", result);

        result = x / y;
        System.out.printf("The result of division is: %d%n", result);
    }
}