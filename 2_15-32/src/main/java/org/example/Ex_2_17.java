package org.example;

import java.util.Scanner;

public class Ex_2_17
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int z;

        System.out.print("Enter first int: ");
        x = input.nextInt();

        System.out.print("Enter first int: ");
        y = input.nextInt();

        System.out.print("Enter first int: ");
        z = input.nextInt();

        System.out.print("\n");

        int result;

        result = x + y + z;
        System.out.printf("The result of sum is: %d%n", result);

        result = x * y * z;
        System.out.printf("The result of multiplication is: %d%n", result);

        result = (x + y + z)/3;
        System.out.printf("The average of 3 is: %d%n", result);

        int smallest = x;
        int largest = x;

        if(y > largest)
        {
            largest = y;
        } else if (y < smallest)
        {
            smallest = y;
        }

        if (z > largest)
        {
            largest = z;
        } else if (z < smallest)
        {
            smallest = z;
        }

        System.out.printf("The smallest number is: %d%n", smallest);
        System.out.printf("The largest number is: %d%n", largest);
    }
}
