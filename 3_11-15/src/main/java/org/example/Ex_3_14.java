package org.example;

public class Ex_3_14
{
    public static void main(String [] args)
    {
        Date date1 = new Date(12,29,2003);

        System.out.print("This is my date of birth: ");
        date1.displayDate(date1.getMonth(), date1.getDay(), date1.getYear());

        date1.setDay(11);
        date1.setMonth(9);
        date1.setYear(2004);

        System.out.print("This is not my date of birth: ");
        date1.displayDate(date1.getMonth(), date1.getDay(), date1.getYear());
    }
}
