package com.pluralsight;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args)
    {
        loadEmployees();
        displayEmployees();
    }

    public static void loadEmployees()
    {
        // create a new empty ArrayList
        employees = new ArrayList<>();

        File file = new File("files/employees.csv");

        try(
            FileInputStream fileStream = new FileInputStream(file);
            Scanner fileReader = new Scanner(fileStream);
        )
        {
            fileReader.nextLine();

            while(fileReader.hasNextLine())
            {
                String line = fileReader.nextLine();

                String[] columns = line.split("[|]");
                int employeeId = Integer.parseInt(columns[0]);
                String name = columns[1];
                double hoursWorked = Double.parseDouble(columns[2]);
                double payRate = Double.parseDouble(columns[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                employees.add(employee);
            }
        }
        catch (IOException e)
        {
            System.out.println("There was an error reading the employees file.");
        }

    }

    public static void displayEmployees()
    {
        System.out.println();
        System.out.println("All Employees");
        System.out.println("-".repeat(32));
        System.out.printf("%-3s %-20s %-7s \n", "id","name","pay");
        System.out.printf("%-3s %-20s %-7s \n", "-".repeat(3),"-".repeat(20),"-".repeat(7));

        for(Employee employee : employees)
        {
            System.out.printf("%-3d %-20s %7.2f \n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
        }
    }
}