package org.example.Ex_20_8;

public class Ex_20_8
{
    public static void main(String[] args)
    {
        Pair<Integer, String> pair1 = new Pair<>(1, "Hello");
        System.out.println("Pair 1: " + pair1);

        Pair<Double, Character> pair2 = new Pair<>(3.14, 'A');
        System.out.println("Pair 2: " + pair2);

        pair1.setFirst(2);
        pair1.setSecond("World");
        System.out.println("Updated Pair 1: " + pair1);

        Integer firstElement = pair1.getFirst();
        String secondElement = pair1.getSecond();
        System.out.println("First element: " + firstElement);
        System.out.println("Second element: " + secondElement);
    }
}
