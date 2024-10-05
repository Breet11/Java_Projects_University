package org.example;

public class Ex_4_22
{
    public static void main(String [] args)
    {
        int n = 5;

        System.out.printf("%-7s%-7s%-7s%-7s%n%n","N","10*N","100*N","1000*N");

        for(int i = 1; i < n+1; i++)
        {
            System.out.printf("%-7d%-7d%-7d%-7d%n", i, i*10, i*100, i*1000);
        }
    }
}
