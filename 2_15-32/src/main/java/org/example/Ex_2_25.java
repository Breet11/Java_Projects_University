package org.example;

import java.util.Scanner;

public class Ex_2_25
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

        if((num1%2)==0)
        {
            System.out.print("First int in even!\n");
        }else
        {
            System.out.print("First in odd!\n");
        }

        if((num2%2)==0)
        {
            System.out.print("Second int is even!\n");
        }else
        {
            System.out.print("Second int is odd!\n");
        }
    }
}
