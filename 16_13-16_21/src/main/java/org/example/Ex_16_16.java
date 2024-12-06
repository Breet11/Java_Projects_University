package org.example;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Ex_16_16
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();

        createMap(map);
        displayMap(map);
    }

    private static void createMap(Map<String, Integer> map)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String normalizedInput = input.replaceAll("[^a-zA-Z\\s]", "");
        String[] tokens = normalizedInput.split(" ");

        for (String token: tokens)
        {
            String word = token.toLowerCase();
            if(map.containsKey(word))
            {
                int count = map.get(word);
                map.put(word, count + 1);
            } else
            {
                map.put(word,1);
            }
        }

    }

    private static void displayMap(Map<String, Integer> map)
    {
        System.out.printf("Map contains:%nKey\t\t\t\tValue%n");

        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            System.out.printf("%-10s%10s%n", entry.getKey(),entry.getValue());
        }
    }
}
