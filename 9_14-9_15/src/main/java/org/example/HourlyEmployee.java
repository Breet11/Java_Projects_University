package org.example;

public class HourlyEmployee extends Employee
{
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double wage, double hours)
    {
        super(firstName, lastName, socialSecurityNumber);

        this.hours = hours;
        this.wage = wage;
    }

    public double getHours()
    {
        return hours;
    }

    public double getWage()
    {
        return wage;
    }

    public void setHours(double hours)
    {
        if (hours >= 0 && hours <= 168)
        {
            this.hours = hours;
        } else
        {
            System.out.println("Hours must be between 0 and 168");
        }
    }

    public void setWage(double wage)
    {
        if(wage >= 0)
        {
            this.wage = wage;
        } else
        {
            System.out.println("Wage cannot be negative!");
        }
    }

    public double earnings()
    {
        if(hours <= 40)
        {
            return wage * hours;
        } else
        {
            double overtimeHours = hours - 40;
            return (40 * wage) + (overtimeHours * wage * 1.5);
        }
    }

    @Override
    public String toString()
    {
        return String.format("%s\nWage: %.2f\tHours: %.2f", super.toString(), wage, hours);
    }
}
