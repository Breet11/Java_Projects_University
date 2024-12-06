package org.example.Ex_10_12;

public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
                            Date birthDate, double weeklySalary)
    {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings()
    {
        return weeklySalary;
    }
}
