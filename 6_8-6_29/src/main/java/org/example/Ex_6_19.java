package org.example;
import java.util.Scanner;

public class Ex_6_19
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fill char: ");
        char fill = input.next().charAt(0); //инициализирует char по индексу в методе charAt

        System.out.print("Enter the side of square: ");
        int side = input.nextInt();

        squareOfAnyChar(side, fill);
    }

    public static void squareOfAnyChar(int side, char fillCharacter)
    {
        for(int i=0; i < side; i++)
        {
            for(int j=0; j < side; j++)
            {
                System.out.printf("%c",fillCharacter);
            }
            System.out.println();
        }
    }
}
