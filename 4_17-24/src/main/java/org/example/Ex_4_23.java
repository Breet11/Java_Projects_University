package org.example;

import java.util.Scanner;

public class Ex_4_23
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int number;
        int largest = 0;
        int second_largest = 0;

        while(counter < 10)
        {
            System.out.print("Enter amount of sales: ");
            number = input.nextInt();

            if(number > largest)
            {
                second_largest = largest;
                largest = number;
            } else if(number > second_largest)
            {
                second_largest = number;
            }
            counter++;
        }

        System.out.printf("Competition winner, seller who sold %d products%n", largest);
        System.out.printf("Second place, seller who sold %d products%n", second_largest);

    }
}
