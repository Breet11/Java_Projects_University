package org.example.Ex_10_12;
import java.util.Calendar;

public class Ex_10_12
{
    public static void main(String[] args)
    {
        Employee employees[] = new Employee[3];

        employees[0] = new SalariedEmployee("John", "Doe","111-22-3333", new Date(
                15,8,1990), 800);
        employees[1] = new HourlyEmployee("Jane", "Smith", "444-55-6666", new Date(
                10,12,1995), 20, 50);
        employees[2] = new HourlyEmployee("Bill", "Johnson","777-88-9999", new Date(
                25,8,1988), 15, 40);

        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1 ;

        for(Employee employee: employees)
        {
            double earnings = employee.earnings();

            if(employee.getBirthDate().getMonth() == currentMonth)
            {
                earnings += 100;
            }

            System.out.println(employee);
            System.out.printf("Earnings: %.2f\n\n", earnings);
        }
    }
}