package org.example.Ex_10_12;

public abstract class Employee
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s\nSSN: %s\nBirth Date: %s",
                firstName, lastName, socialSecurityNumber, birthDate.toString());
    }
}
