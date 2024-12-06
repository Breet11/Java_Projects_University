package org.example;

public class Ex_20_6
{
    public static <T> void printArray(T[] array)
    {
        for (T element : array)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array)
    {
        System.out.println("Index\tString Value");
        System.out.println("----------------------");

        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("%d\t%s%n", i, array[i]);
        }
    }

    public static void main(String[] args)
    {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        printArray(intArray);

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("\nDouble Array:");
        printArray(doubleArray);

        String[] stringArray = {"Apple", "Banana", "Cherry", "Date"};
        System.out.println("\nString Array (Tabular Format):");
        printArray(stringArray);
    }
}
