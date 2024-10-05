package org.example;

import java.util.Scanner;

public class Ex_5_17
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int productNumber;
        int quantitySold;

        double retailValue = 0;

        System.out.print("Product number and it's cost:\n");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n", "Product 1: 2.98$", "Product 2: 4.50$",
                "Product 3: 9.98$", "Product 4: 4.49$", "Product 5: 6.67$");

        while(true)
        {
            System.out.print("Enter product number or -1 to break: ");
            productNumber = input.nextInt();

            if(productNumber == -1)
            {
                break;
            }

            double price;

            switch(productNumber)
            {
                case 1:
                    quantitySold = enterQuant();
                    price = 2.98;
                    break;
                case 2:
                    quantitySold = enterQuant();
                    price = 4.50;
                    break;
                case 3:
                    quantitySold = enterQuant();
                    price = 9.98;
                    break;
                case 4:
                    quantitySold = enterQuant();
                    price = 4.49;
                    break;
                case 5:
                    quantitySold = enterQuant();
                    price = 6.87;
                    break;
                default:
                    System.out.print("Invalid product number! ");
                    continue;
            }
            retailValue = price * quantitySold;
        }
        System.out.printf("Total retail value: %.2f", retailValue);
    }

    public static int enterQuant()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quantity sold: ");
        return input.nextInt();
    }
}
