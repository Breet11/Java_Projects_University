package org.example;

import java.util.Scanner;

public class Ex_7_12
{
    public static void main(String[] args)
    {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        int count = 0;
        for(int i=0; i<5; i++)
        {
            System.out.printf("Enter %d element of array between 10 and 100:%n", i);
            int number = input.nextInt();
            boolean uniqueFlag = true;
            for(int j=0; j<5; j++)
            {
                if(array[j] == number)
                {
                    uniqueFlag = false;
                    break;
                }
            }
            if(uniqueFlag && number >= 10 && number <= 100)
            {
                array[count] = number;
                count++;

                System.out.println("Unique numbers: ");
                for (int k = 0; k < 5; k++)
                {
                    System.out.printf("%d\t", array[k]);
                }
                System.out.println();
            } else if(number < 10 || number > 100)
            {
                System.out.println("The number must be between 10 and 100");
            }
        }
    }
}