package org.example;

import java.util.Scanner;

public class Ex_3_11
{
    public static void main(String[] args)
    {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter deposit amount for %s: ", account1.getName());
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to %s balance%n%n", depositAmount, account1.getName());
        account1.deposit(depositAmount);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

        System.out.printf("Enter deposit amount for %s: ", account2.getName());
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to %s balance%n%n", depositAmount, account2.getName());
        account2.deposit(depositAmount);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

        System.out.printf("Enter amount you want to withdraw from %s balance: ", account1.getName());
        double withdraw = input.nextDouble();
        account1.withdraw(withdraw);
        System.out.printf("%s balance after withdraw: %.2f%n", account1.getName(), account1.getBalance());

        System.out.printf("Enter amount you want to withdraw from %s balance: ", account2.getName());
        withdraw = input.nextDouble();
        account2.withdraw(withdraw);
        System.out.printf("%s balance after withdraw: %.2f%n", account2.getName(), account2.getBalance());

    }
}