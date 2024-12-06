package org.example;

public class Ex_9_14
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Vasya", "Pupkin", "111-22-3333");
        System.out.println("Employee class test: \n" + employee1.toString());

        CommissionEmployee employee2 = new CommissionEmployee("Vladimir", "Ivanov",
                "444-55-6666", 10000, 0.05);
        System.out.println("\nCommission class test: \n" + employee2.toString());

        BasePlusCommissionEmployee employee3 = new BasePlusCommissionEmployee("Ivan", "Orlov",
                "777-88-9999", 5000, 0.04, 300);
        System.out.println("\nBase plus Commission class test: \n" + employee3.toString());
    }
}
