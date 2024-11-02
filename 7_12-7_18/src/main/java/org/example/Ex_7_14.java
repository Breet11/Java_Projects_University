package org.example;

public class Ex_7_14
{
    public static void main(String[] args)
    {
        System.out.printf("The product of 2 and 2: %d%n", product(2,2));
        System.out.printf("The product of 2 and 3 and 4 : %d%n", product(2,3,4));
        System.out.printf("The product of 1 and 2 and 3 and 4 and 5 : %d%n", product(1,2,3,4,5));
    }
    public static int product(int... numbers)
    {
        int result = 1;
        for(int number: numbers)
        {
            result = result * number;
        }
        return result;
    }
}
