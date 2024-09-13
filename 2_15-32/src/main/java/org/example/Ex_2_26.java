package org.example;

import java.util.Scanner;

public class Ex_2_26
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first int: ");
        num1 = input.nextInt();

        System.out.print("Enter second int: ");
        num2 = input.nextInt();

        if((num1 % num2) == 0)
        {
            System.out.print("First int is multiple of second!");
        } else
        {
            System.out.print("First int is not multiple of second!");
        }
    }
}
