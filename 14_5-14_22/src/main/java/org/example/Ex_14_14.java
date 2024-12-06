package org.example;

import java.util.Scanner;

public class Ex_14_14
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();

        String[] words = line.split(" ");

        System.out.println("Words ending with 'ED':");
        for (String word : words) {
            if (word.toUpperCase().endsWith("ED")) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
