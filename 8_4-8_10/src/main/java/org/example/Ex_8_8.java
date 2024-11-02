package org.example;

public class Ex_8_8
{
    public static void main(String[] args)
    {
        ModifiedDate date = new ModifiedDate(12,31,2003);
        date.nextDay();
        System.out.println("The next day: " + date.toString());
        date = new ModifiedDate(11, 30, 2003);
        date.nextDay();
        System.out.println("The next day: " + date.toString());
    }
}
