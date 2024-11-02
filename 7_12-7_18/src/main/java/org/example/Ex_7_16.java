package org.example;

public class Ex_7_16
{
    public static void main(String[] args)
    {
        double sum = 0;
        for(int i=0; i < args.length; i++)
        {
            sum += Double.parseDouble(args[i]);
        }
        System.out.printf("The sum of args: %.2f%n", sum);
    }
}
