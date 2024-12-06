package org.example;

public class Ex_11_20
{
    public static void someMethod2() throws Exception
    {
        System.out.println("Inside someMethod2: throwing exception");
        throw new Exception("Exception thrown from someMethod2");
    }

    public static void someMethod() throws Exception
    {
        try
        {
            someMethod2();
        }
        catch (Exception e)
        {
            System.out.println("Inside someMethod: Caught exception, rethrowing...");
            throw e;
        }
    }
    public static void main(String[] args)
    {
        try
        {
            someMethod();
        }
        catch (Exception e)
        {
            System.out.println("Inside main: Caught rethrown exception");
            e.printStackTrace();
        }

    }
}
