package org.example;

public class SavingsAccount
{
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }

    public static void modifyInterestRate(double annualInterestRate)
    {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void setSavingsBalance(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }

    public static double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public double getSavingsBalance()
    {
        return savingsBalance;
    }

    public void calculateMonthlyInterest()
    {
        double monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance += monthlyInterest;
    }
}
