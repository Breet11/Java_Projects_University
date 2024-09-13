package org.example;

import java.util.Scanner;

public class Ex_2_32
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        System.out.print("Enter fourth number: ");
        num4 = input.nextInt();

        System.out.print("Enter fifth number: ");
        num5 = input.nextInt();

        System.out.print("\n");

        int Positive_count = 0;
        int Negative_count = 0;
        int Null_count = 0;

        if (num1 > 0 )
        {
            Positive_count++;
        } else if (num1 < 0)
        {
            Negative_count++;
        }else
        {
            Null_count++;
        }

        if (num2 > 0 )
        {
            Positive_count++;
        } else if (num2 < 0)
        {
            Negative_count++;
        }else
        {
            Null_count++;
        }

        if (num3 > 0 )
        {
            Positive_count++;
        } else if (num3 < 0)
        {
            Negative_count++;
        }else
        {
            Null_count++;
        }

        if (num4 > 0 )
        {
            Positive_count++;
        } else if (num4 < 0)
        {
            Negative_count++;
        }else
        {
            Null_count++;
        }

        if (num5 > 0 )
        {
            Positive_count++;
        } else if (num5 < 0)
        {
            Negative_count++;
        }else
        {
            Null_count++;
        }

        System.out.printf("The amount of positive numbers is: %d%n", Positive_count);
        System.out.printf("The amount of negative numbers is: %d%n", Negative_count);
        System.out.printf("The amount of zero numbers is: %d%n", Null_count);
    }
}
