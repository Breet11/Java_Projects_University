package org.example;

public class CommissionEmployee extends Employee
{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate()
    {
        return commissionRate;
    }

    public double getGrossSales()
    {
        return grossSales;
    }

    public double earnings()
    {
        return commissionRate * grossSales;
    }

    @Override
    public String toString()
    {
        return String.format("%s\nGross Sales: %.2f\t Commission Rate: %.2f", super.toString(), grossSales, commissionRate);
    }
}
