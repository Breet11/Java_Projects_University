package org.example.Ex_10_14;

public class Ex_10_14
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[3];

        employees[0] = new PieceWorker("John", "Doe", "111-22-3333",25, 100);
        employees[1] = new HourlyEmployee("Jane", "Smith", "444-55-6666", 30, 40);
        employees[2] = new SalariedEmployee("Bill", "Clinton", "777-88-9999", 200);

        for(Employee employee: employees)
        {
            System.out.println(employee);
            System.out.printf("Earnings: %.2f\n\n", employee.earnings());
        }
    }
}
