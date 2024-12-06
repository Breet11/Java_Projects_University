package org.example;

import java.util.Scanner;

public class Ex_14_19
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (MM/dd/yyyy): ");
        String inputDate = scanner.nextLine();

        String[] dateParts = inputDate.split("/");

        if (dateParts.length == 3) {
            try {
                int month = Integer.parseInt(dateParts[0]);
                int day = Integer.parseInt(dateParts[1]);
                int year = Integer.parseInt(dateParts[2]);

                String[] months = {
                        "January", "February", "March", "April", "May", "June",
                        "July", "August", "September", "October", "November", "December"
                };

                if (month >= 1 && month <= 12) {
                    String formattedDate = months[month - 1] + " " + day + ", " + year;
                    System.out.println("Formatted date: " + formattedDate);
                } else {
                    System.out.println("Invalid month. Please enter a valid date in MM/dd/yyyy format.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid date format. Please use MM/dd/yyyy.");
            }
        } else {
            System.out.println("Invalid date format. Please use MM/dd/yyyy.");
        }

    }
}
