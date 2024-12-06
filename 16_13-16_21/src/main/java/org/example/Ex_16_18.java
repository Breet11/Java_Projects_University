package org.example;

import java.util.Collection;
import java.util.LinkedList;

public class Ex_16_18
{
    public static void main(String[] args)
    {
        LinkedList<Character> LinkedList = new LinkedList<>();
        for (char ch = 'A'; ch < 'K'; ch++)
        {
            LinkedList.add(ch);
        }
        LinkedList<Character> reversedLinkedList = LinkedList.reversed();
        System.out.println("Original linked list: "+ LinkedList);
        System.out.println("Reversed linked list: "+ reversedLinkedList);
    }
}
