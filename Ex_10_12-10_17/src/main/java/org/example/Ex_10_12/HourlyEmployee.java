package org.example.Ex_10_12;

public class HourlyEmployee extends Employee
{
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          Date birthDate, double hourlyWage, double hoursWorked)
    {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double earnings()
    {
        return (hoursWorked <= 40) ? hourlyWage * hoursWorked :
                (40 * hourlyWage) + ((hoursWorked - 40) * hourlyWage * 1.5);
    }
}

