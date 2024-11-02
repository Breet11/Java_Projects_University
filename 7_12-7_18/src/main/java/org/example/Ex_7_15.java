package org.example;

public class Ex_7_15
{
    public static void main(String[] args)
    {
        int arraySize = 10;
        if(args.length == 1)
        {
            arraySize = Integer.parseInt(args[0]);
        }
        int[] array = new int[arraySize];

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++)
        {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
