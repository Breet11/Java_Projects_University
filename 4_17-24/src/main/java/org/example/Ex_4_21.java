package org.example;

import java.util.Scanner;

public class Ex_4_21
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int number;
        int largest = 0;

        while(counter < 10)
        {
            System.out.print("Enter amount of sales: ");
            number = input.nextInt();

            if(number > largest)
            {
                largest = number;
            }
            counter++;
        }

        System.out.printf("Competition winner, seller who sold %d products%n", largest);
    }
}
