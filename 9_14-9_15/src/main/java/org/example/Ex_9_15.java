package org.example;

public class Ex_9_15
{
    public static void main(String[] args)
    {
        HourlyEmployee employee = new HourlyEmployee("Vasya", "Pupkin", "111-22-3333",
                15.5, 40);
        System.out.println("Hourly employee test: " + employee.toString());

        System.out.println("Earnings: " + employee.earnings());
        employee.setHours(170);
    }
}
