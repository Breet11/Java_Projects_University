package org.example;

import java.util.Scanner;

public class Ex_3_15
{
    public static void main(String[] args)
    {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        displayAccount(account1);
        displayAccount(account2);
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter deposit amount for %s: ", account1.getName());
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to %s balance%n%n", depositAmount, account1.getName());
        account1.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.printf("Enter deposit amount for %s: ", account2.getName());
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to %s balance%n%n", depositAmount, account2.getName());
        account2.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

    }

    public static void displayAccount(Account accountToDisplay)
    {
        System.out.printf("%s balance: %.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
