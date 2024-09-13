package org.example;

import java.util.Scanner;

public class Ex_2_30
{
    public static void main(String[] args)
    {
        int num1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number consisting of 5 digits: ");
        num1 = input.nextInt();

        if(num1 <= 99999 & num1 > 9999)
        {
            System.out.printf("%d\t %d\t %d\t %d\t %d%n",num1 / 10000, (num1/1000) % 10, (num1/100) % 10, (num1/10) % 10, num1 % 10);
        } else
        {
            System.out.print("You entered wrong number!");
        }
    }
}
