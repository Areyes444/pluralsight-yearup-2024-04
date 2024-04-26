package com.pluralsight;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args)
    {
        loadEmployees();

      displayAllEmployees();

    }

    public static void loadEmployees()
    {
        File file = new File("file/employees.csv");

        try(Scanner fileScanner = new Scanner(file))
        {
            fileScanner.nextLine();

            while(fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();
                String[] columns = line.split("[|]");
                String employeeId = columns[0];
                String name = columns[1];
                int hoursWorked = Integer.parseInt(columns[2]);
                double payRate = Double.parseDouble(columns[3]);

            }

        }
        catch(IOException ex)
        {

        }
    }

    public static void displayAllEmployees()
    {
        System.out.println();
        System.out.println("All Employees ");
        System.out.println("-".repeat(70));

        for(Employee employee : employees)
        {
            printEmployee(employee);
        }
    }
    public static void printEmployee(Employee employee)
    {
        System.out.printf("%-10s -35s %d %6.2f \n", employee.getEmployeeId(), employee.getName(), employee.getHoursWorked(),employee.getPayRate());
    }
}
