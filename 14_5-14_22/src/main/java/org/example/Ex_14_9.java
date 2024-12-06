package org.example;

import java.util.Scanner;

public class Ex_14_9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line of text: ");
        String line = input.nextLine();

        String[] words = line.split(" ");
        System.out.println("Reversed words:");
        for(int i= words.length-1; i>=0;i--)
        {
            System.out.print(words[i] + " ");
        }
    }
}
