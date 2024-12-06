package org.example;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Ex_16_14
{
    public static void main(String[] args)
    {
        Map<Character, Integer> map = new HashMap<>();

        createMap(map);
        displayMap(map);
    }

    private static void createMap(Map<Character, Integer> map)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");

        for (String token: tokens)
        {
            String word = token.toLowerCase();
            for(char letter: token.toCharArray())
            {
                if(map.containsKey(letter))
                {
                    int count = map.get(letter);
                    map.put(letter, count +1);
                } else
                {
                    map.put(letter, 1);
                }

            }
        }
    }
    private static void displayMap(Map<Character, Integer> map)
    {
        System.out.printf("Map contains:%nKey\t\t\t\tValue%n");

        for(Map.Entry<Character, Integer> entry: map.entrySet())
        {
            System.out.printf("%-10s%10s%n", entry.getKey(),entry.getValue());
        }
    }
}
