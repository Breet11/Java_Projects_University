package org.example;

public class Invoice
{
    private String part_number;
    private String part_description;
    private int quantity;
    private double price;

    public Invoice()
    {
        this.part_number = "";
        this.part_description = "";
        this.quantity = 0;
        this.price = 0.0;
    }
    public Invoice(String part_number, String part_description, int quantity, double price)
    {
        this.part_number = part_number;
        this.part_description = part_description;
        this.quantity = quantity;
        this.price = price;
    }

    public void setPart_description(String part_description)
    {
        this.part_description = part_description;
    }

    public void setPart_number(String part_number)
    {
        this.part_number = part_number;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public String getPart_description()
    {
        return part_description;
    }

    public String getPart_number()
    {
        return part_number;
    }

    public double getInvoiceAmount(int quantity, double price)
    {
        if(quantity <= 0)
        {
            quantity = 0;
        }
        if(price <= 0)
        {
            price = 0.0;
        }
        return price * quantity;
    }
}
