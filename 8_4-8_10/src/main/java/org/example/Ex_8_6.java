package org.example;

public class Ex_8_6
{
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(0.04);

        for (int i = 1; i <= 12; i++)
        {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.printf("Month %d: Saver1: %.2f, Saver2: %.2f%n", i, saver1.getSavingsBalance(),
                    saver2.getSavingsBalance());
        }
        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();;

        System.out.printf("Balance after 1 month with 5%%: Saver1: %.2f, Saver2: %.2f%n", saver1.getSavingsBalance(),
                saver2.getSavingsBalance());
    }
}
