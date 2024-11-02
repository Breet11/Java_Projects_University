package org.example;

public class Ex_8_5
{
    public static void main(String[] args)
    {
        Time2 time = new Time2(9,3,40);

        System.out.println("Time in universal format: "+ time.toUniversalString());
        System.out.println("Time in standard format: "+ time.toString());

        time.setTime(18,32,3);
        System.out.println("Time in universal format: "+ time.toUniversalString());
        System.out.println("Time in standard format: "+ time.toString());
    }
}
