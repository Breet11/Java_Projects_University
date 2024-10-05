package org.example;

public class Ex_4_18
{
    public static void main(String[] args)
        {
            Customer customer_1 = new Customer(1,10000, 1000, 2000, 11000);
            Customer customer_2 = new Customer(2,10000, 1000, 500, 9000);
            
            customer_1.displayCustomerInfo();

            customer_2.displayCustomerInfo();
        }
}
