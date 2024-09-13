package org.example;

import java.util.Scanner;

public class Ex_2_28
{
    public static void main(String[] args)
    {
        int r;

        Scanner input = new Scanner(System.in);

        System.out.print("Write radius as int: ");
        r = input.nextInt();

        System.out.printf("The diameter is: %d%n", 2 * r);
        System.out.printf("The circumference is: %f%n", 2 * Math.PI * r);
        System.out.printf("The area is: %f%n", Math.PI * (r * r));
    }
}
