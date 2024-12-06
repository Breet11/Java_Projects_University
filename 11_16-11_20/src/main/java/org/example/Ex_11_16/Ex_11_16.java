package org.example.Ex_11_16;

public class Ex_11_16
{
    public static void main(String[] args)
    {
        try
        {
            throw new ExceptionC("This is an ExceptionC");
        }
        catch(Exception e)
        {
            System.out.println("Caught exceptionA or its subclasses: " + e.getMessage());
        }

        try
        {
            throw new ExceptionB("This is an ExceptionB");
        }
        catch(Exception e)
        {
            System.out.println("Caught exceptionA or its subclasses: " + e.getMessage());
        }

        try
        {
            throw new ExceptionA("This is an ExceptionA");
        }
        catch(Exception e)
        {
            System.out.println("Caught exceptionA: " + e.getMessage());
        }
    }
}
