package org.example;

import java.util.Random;

public class Ex_7_17
{
    public static void main(String[] args)
    {
        int[] array = new int[13];
        Random random = new Random();

        for(int i = 0; i < 36000000; i++)
        {
            int roll_1 = 1 + random.nextInt(6);
            int roll_2 = 1 + random.nextInt(6);
            int sum = roll_1 + roll_2;
            array[sum]++;
        }
        for(int sum=2; sum <= 12; sum++)
        {
            System.out.printf("%d: %d%n", sum,array[sum]);

        }
    }
}
