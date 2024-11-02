package org.example;

public class ModifiedDate
{
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public ModifiedDate(int month, int day, int year)
    {
        if(month <= 0 || month > 12)
        {
            throw new IllegalArgumentException("month (" + month + ") muse be 1-12");
        }

        if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
        {
            throw new IllegalArgumentException("day (" + day + ") out of range for the specific month and year");
        }

        if(month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
        {
            throw new IllegalArgumentException("day (" + day + ") out of range for the specific month and year");
        }

        if(year <=0)
        {
            throw new IllegalArgumentException("Year cant be negative or 0");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    public void nextDay()
    {
        if(day < daysInMonth(month, year))
        {
            day ++;
        } else
        {
            day = 1;
            if(month < 12)
            {
                month++;
            } else
            {
                month = 1;
                year++;
            }
        }
    }
    private int daysInMonth(int month, int year)
    {
        if(month == 2 &&( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
        {
            return 29;
        }
        return daysPerMonth[month];
    }
    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }
}
