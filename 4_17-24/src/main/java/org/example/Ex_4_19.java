package org.example;

import java.util.Scanner;

public class Ex_4_19
{
    public static void main(String [] args)
    {
        double base_salary = 200.00;
        double rate = 0.09;

        Scanner input = new Scanner(System.in);

        double item1_cost = 239.99;
        double item2_cost = 129.75;
        double item3_cost = 99.95;
        double item4_cost = 350.89;

        System.out.print("Enter number of item 1 sold: ");
        int item_1_quant = input.nextInt();
        System.out.print("Enter number of item 2 sold: ");
        int item_2_quant = input.nextInt();
        System.out.print("Enter number of item 3 sold: ");
        int item_3_quant = input.nextInt();
        System.out.print("Enter number of item 4 sold: ");
        int item_4_quant = input.nextInt();

        double totalSales = (item_1_quant * item1_cost)+ (item_2_quant * item2_cost) +
                (item_3_quant * item3_cost) + (item_4_quant * item4_cost);

        double totalEarnings = (totalSales * rate) + base_salary;

        System.out.printf("Total sales this week: %.2f%n", totalSales);
        System.out.printf("Total earnings this week: %.2f%n", totalEarnings);
    }
}
