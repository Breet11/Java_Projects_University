package org.example;

import java.util.Scanner;

public class Ex_14_11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine();

        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        int count = 0;
        int index = text.indexOf(searchChar);

        while (index != -1) {
            count++;
            index = text.indexOf(searchChar, index + 1);
        }

        System.out.println("The character '" + searchChar + "' appears " + count + " time(s) in the text.");

        scanner.close();
    }
}
