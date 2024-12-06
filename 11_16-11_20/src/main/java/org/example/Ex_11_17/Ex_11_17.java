package org.example.Ex_11_17;

import java.io.IOException;

public class Ex_11_17
{
    public static void main(String[] args)
    {
        try
        {
            throw new ExceptionB("This is ExceptionB");
        }
        catch(Exception e)
        {
            System.out.println("Caught exceptionB " + e.getMessage());
        }

        try
        {
            throw new ExceptionA("This is ExceptionA");
        }
        catch(Exception e)
        {
            System.out.println("Caught exceptionA " + e.getMessage());
        }

        try
        {
            throw new NullPointerException("This is NullPointerException");
        }
        catch(Exception e)
        {
            System.out.println("Caught NullPointerException " + e.getMessage());
        }

        try
        {
            throw new IOException("This is IOException");
        }
        catch(Exception e)
        {
            System.out.println("Caught IOException " + e.getMessage());
        }
    }
}
