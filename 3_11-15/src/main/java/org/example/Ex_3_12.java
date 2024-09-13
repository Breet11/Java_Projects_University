package org.example;

public class Ex_3_12
{
    public static void main(String[] args)
    {
        Invoice wheel_invoice = new Invoice();
        Invoice FrontBrakePads_invoice = new Invoice("2", "Front brake pads", 2, 0);
        Invoice RearBrakePads_invoice = new Invoice("3", "Rear brake pads", 0, 200.72);

        wheel_invoice.setPrice(1590.50);
        wheel_invoice.setQuantity(2);
        wheel_invoice.setPart_description("wheel");
        wheel_invoice.setPart_number("1");

        System.out.printf("%nThe part number: %s%n", wheel_invoice.getPart_number());
        System.out.printf("The part description: %s%n", wheel_invoice.getPart_description());
        System.out.printf("The quantity in invoice: %d%n", wheel_invoice.getQuantity());
        System.out.printf("The price per item is: %.2f%n", wheel_invoice.getPrice());
        System.out.printf("Total cost will be: %.2f%n%n", wheel_invoice.getInvoiceAmount(wheel_invoice.getQuantity(),wheel_invoice.getPrice()));

        System.out.printf("The part number: %s%n", FrontBrakePads_invoice.getPart_number());
        System.out.printf("The part description: %s%n", FrontBrakePads_invoice.getPart_description());
        System.out.printf("The quantity in invoice: %d%n", FrontBrakePads_invoice.getQuantity());
        System.out.printf("The price per item is: %.2f%n", FrontBrakePads_invoice.getPrice());
        System.out.printf("Total cost will be: %.2f%n%n", FrontBrakePads_invoice.getInvoiceAmount(FrontBrakePads_invoice.getQuantity(),FrontBrakePads_invoice.getPrice()));

        System.out.printf("The part number: %s%n", RearBrakePads_invoice.getPart_number());
        System.out.printf("The part description: %s%n", RearBrakePads_invoice.getPart_description());
        System.out.printf("The quantity in invoice: %d%n", RearBrakePads_invoice.getQuantity());
        System.out.printf("The price per item is: %.2f%n", RearBrakePads_invoice.getPrice());
        System.out.printf("Total cost will be: %.2f%n%n", RearBrakePads_invoice.getInvoiceAmount(RearBrakePads_invoice.getQuantity(),RearBrakePads_invoice.getPrice()));

    }
}
