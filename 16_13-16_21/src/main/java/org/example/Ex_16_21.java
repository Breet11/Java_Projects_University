package org.example;

import java.util.Collections;
import java.util.PriorityQueue;

public class Ex_16_21
{
    public static void main(String[] args)
    {
         PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

        System.out.println("Polling elements from PriorityQueue in descending order:");
        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
    }
}
