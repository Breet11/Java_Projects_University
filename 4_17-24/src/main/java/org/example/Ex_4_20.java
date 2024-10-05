package org.example;

import java.util.Scanner;

public class Ex_4_20
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        double worker1_rate = 4.40;
        double worker2_rate = 5.61;
        double worker3_rate = 11.22;

        System.out.print("Enter how many hours the first employee worked: ");
        int worker1_hours = input.nextInt();
        System.out.print("Enter how many hours the second employee worked: ");
        int worker2_hours = input.nextInt();
        System.out.print("Enter how many hours the third employee worked: ");
        int worker3_hours = input.nextInt();

        System.out.printf("Total salary of first employee: %.2f%n", calcSalary(worker1_hours, worker1_rate));
        System.out.printf("Total salary of second employee: %.2f%n", calcSalary(worker2_hours, worker2_rate));
        System.out.printf("Total salary of third employee: %.2f%n", calcSalary(worker3_hours, worker3_rate));

    }
    public static double calcSalary(int hours, double rate)
    {
        double totalsalary;
        double increasedrate;
        double extrasalary;
        int extra_hours;

        if(hours > 40)
        {
            extra_hours = hours - 40;
            increasedrate = rate * 1.5;
            extrasalary = extra_hours * increasedrate;
            totalsalary = ((hours - extra_hours) * rate) + extrasalary;
            return totalsalary;
        }

        totalsalary = hours * rate;
        return totalsalary;
    }
}
