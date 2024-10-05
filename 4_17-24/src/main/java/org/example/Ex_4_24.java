package org.example;

import java.util.Scanner;

public class Ex_4_24
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 0;

        while(studentCounter <= 10)
        {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            while(result != 1 && result !=2)
            {
                System.out.print("You entered wrong number please write 1 or 2: ");
                result = input.nextInt();
            }
            if(result == 1)
            {
                passes++;
            } else
            {
                failures++;
            }
            studentCounter++;
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8)
        {
            System.out.println("Bonus to instructor!");
        }
    }
}