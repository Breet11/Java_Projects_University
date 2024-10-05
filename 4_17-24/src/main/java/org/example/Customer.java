package org.example;

public class Customer
{
    private int account_number;
    private int balance;
    private int charges;
    private int credits;
    private int creditLimit;

    public Customer(int account_number, int balance, int charges, int credits, int creditLimit)
    {
        this.account_number = account_number;
        this.balance = balance;
        this.charges = charges;
        this.credits = credits;
        this.creditLimit = creditLimit;
    }

    public int calcNewBalance()
    {
        return balance + charges - credits;
    }

    public boolean isCreditLimitExceeded()
    {
        return calcNewBalance() > creditLimit;
    }

    public void displayCustomerInfo()
    {
        int newBalance = calcNewBalance();
        System.out.printf("Customer's number: %d%n", account_number);
        System.out.printf("Customer's balance: %d%n", balance);
        System.out.printf("Customer's charges: %d%n", charges);
        System.out.printf("Customer's credits: %d%n", credits);
        System.out.printf("Customer's credit limit: %d%n", creditLimit);
        System.out.printf("Customer's new balance: %d%n%n", newBalance);

        if(isCreditLimitExceeded())
        {
            System.out.printf("Credit limit is exceeded! for customer %d%n", account_number);
        }
    }

}
