package org.example;

public class Ex_8_7
{
    public static void main(String[] args)
    {
        ModifiedTime2 time = new ModifiedTime2(23,59,59);
        time.tick();
        System.out.println("Time after tick: " + time.toUniversalString());

        time.setTime(10,59,59);
        time.tick();
        System.out.println("Time after tick: " + time.toUniversalString());

        time.setTime(10,10,59);
        time.tick();
        System.out.println("Time after tick: " + time.toUniversalString());

        time.setTime(10,10,10);
        time.tick();
        System.out.println("Time after tick: " + time.toUniversalString());
    }
}
