package org.example.Ex_20_5;


public class Ex_20_5
{
    public static <T> void printArray(T[] array)
    {
        for (T element : array)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> int printArray(T[] array, int lowSubscript, int highSubscript) throws InvalidSubscriptionException
    {
        if (lowSubscript < 0 || highSubscript >= array.length || lowSubscript > highSubscript)
        {
            throw new InvalidSubscriptionException("Invalid subscript values.");
        }

        int count = 0;
        for (int i = lowSubscript; i <= highSubscript; i++)
        {
            System.out.print(array[i] + " ");
            count++;
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args)
    {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        Character[] characterArray = {'A', 'B', 'C', 'D', 'E'};

        try {
            System.out.println("Integer array:");
            printArray(integerArray);
            System.out.println("Double array:");
            printArray(doubleArray);
            System.out.println("Character array:");
            printArray(characterArray);

            System.out.println("\nPrinting a portion of the Integer array:");
            int printedCount = printArray(integerArray, 2, 5);
            System.out.println("Elements printed: " + printedCount);

            System.out.println("\nPrinting a portion of the Double array:");
            printedCount = printArray(doubleArray, 1, 3);
            System.out.println("Elements printed: " + printedCount);

            System.out.println("\nPrinting a portion of the Character array:");
            printedCount = printArray(characterArray, 0, 2);
            System.out.println("Elements printed: " + printedCount);

            System.out.println("\nTesting invalid subscripts:");
            printArray(integerArray, -1, 3);
        } catch (InvalidSubscriptionException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}