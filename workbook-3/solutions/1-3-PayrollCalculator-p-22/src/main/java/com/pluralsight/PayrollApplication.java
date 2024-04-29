package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PayrollApplication
{
    private ArrayList<Employee> employees;
    Scanner userInput = new Scanner(System.in);

    public void run()
    {
        loadEmployees();

        while(true)
        {
            System.out.println("What do you want to do?");
            System.out.println(" 1 - display employees");
            System.out.println(" 2 - save as csv");
            System.out.println(" 3 - save as json");
            System.out.println(" 4 - exit without saving");
            System.out.print("Please make your selection: ");
            int choice = Integer.parseInt(userInput.nextLine().strip());

            switch(choice)
            {
                case 1:
                    printEmployees();
                    break;
                case 2:
                    saveAsCsv();
                    break;
                case 3:
                    saveAsJSON();
                    break;
                case 4:
                    System.out.println("Goodbye");
                    return;
                default:
                    System.out.println("Please make a valid selection");
                    break;
            }
        }



    }

    private void saveAsCsv()
    {
        File file = new File("files/payroll.csv");

        try(FileWriter fileWriter = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fileWriter);
        )
        {
            for(Employee employee: employees)
            {
                writer.printf("%d|%s|%.2f\n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }
        }
        catch(Exception ex)
        {

        }
    }

    private void saveAsJSON()
    {
        File file = new File("files/payroll.json");

        try(FileWriter fileWriter = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fileWriter);
        )
        {
            writer.println("[");
            for(int i = 0; i < employees.size(); i++)
            {
                Employee employee = employees.get(i);
                writer.printf("  {\"id\" : %d, \"name\" : \"%s\", \"grossPay\" : %.2f }", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
                String endOfLine = (i+1 < employees.size()) ? "," : "";
                writer.println(endOfLine);
            }
            writer.println("]");
        }
        catch(Exception ex)
        {

        }
    }

    private void loadEmployees()
    {
        employees = new ArrayList<>();

        File file = new File("files/employees.csv");

        try (FileReader reader = new FileReader(file);
             Scanner scanner = new Scanner(reader);)
        {
            // skip header row
            scanner.nextLine();
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();

                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("[|]");

                int id = lineScanner.nextInt();
                String name = lineScanner.next();
                double hoursWorked = lineScanner.nextDouble();
                double payRate = lineScanner.nextDouble();

                Employee employee = new Employee(id, name, hoursWorked, payRate);
                employees.add(employee);
            }
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
    }

    private void printEmployees()
    {
        System.out.println();
        System.out.println("Employees");
        System.out.println("---------------------------------------");
        for(Employee employee: employees)
        {
            System.out.printf("%2d %-20s %.2f \n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
        }
    }
}
