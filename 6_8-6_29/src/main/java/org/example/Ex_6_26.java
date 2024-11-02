package org.example;

public class Ex_6_26
{
    public static void main(String[] args)
    {
        int a = 7631;

        System.out.printf("%d", reverseInt(a));
    }

    public static int reverseInt(int number)
    {
        int reversed = 0;
        while(number != 0)
        {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        return reversed;
    }
}
