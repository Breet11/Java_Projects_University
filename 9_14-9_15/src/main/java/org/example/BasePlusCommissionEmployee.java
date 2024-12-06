package org.example;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary)
    {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString()
    {
        return String.format("%sBase Salary: %.2f", super.toString(), baseSalary);
    }
}
