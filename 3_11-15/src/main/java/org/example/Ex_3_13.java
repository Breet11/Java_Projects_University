package org.example;

public class Ex_3_13
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Max", "Pain", 9000.00);
        Employee employee3 = new Employee("Ivan", "Romanov", 14567.92);

        employee1.setFirst_name("Michael");
        employee1.setLast_name("Belov");
        employee1.setMonthly_salary(12900.37);

        System.out.printf("%n%s %s's monthly salary is: %.2f%n", employee1.getFirst_name(), employee1.getLast_name(), employee1.getMonthly_salary());
        employee1.setMonthly_salary(employee1.getMonthly_salary() * 1.1);
        System.out.printf("%s %s's monthly salary after 10%% increase: %.2f%n", employee1.getFirst_name(), employee1.getLast_name(), employee1.getMonthly_salary());
        System.out.printf("His annual salary after increase will be: %.2f%n%n", employee1.getMonthly_salary()*12);

        employee2.setMonthly_salary(-1000);
        System.out.printf("%s %s's monthly salary is: %.2f%n", employee2.getFirst_name(), employee2.getLast_name(), employee2.getMonthly_salary());
        employee2.setMonthly_salary(employee2.getMonthly_salary() * 1.1);
        System.out.printf("%s %ss monthly salary after 10%% increase: %.2f%n", employee2.getFirst_name(), employee2.getLast_name(), employee2.getMonthly_salary());
        System.out.printf("His annual salary after increase will be: %.2f%n%n", employee2.getMonthly_salary()*12);

        employee3.setMonthly_salary(0);
        System.out.printf("%s %s's monthly salary is: %.2f%n", employee3.getFirst_name(), employee3.getLast_name(), employee3.getMonthly_salary());
        employee3.setMonthly_salary(employee1.getMonthly_salary() * 1.1);
        System.out.printf("%s %s's monthly salary after 10%% increase: %.2f%n", employee3.getFirst_name(), employee3.getLast_name(), employee3.getMonthly_salary());
        System.out.printf("His annual salary after increase will be: %.2f%n%n", employee3.getMonthly_salary()*12);
    }
}
