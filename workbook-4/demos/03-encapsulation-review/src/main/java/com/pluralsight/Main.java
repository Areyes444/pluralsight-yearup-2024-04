package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        oopDemo();
    }

    public static void oopDemo()
    {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee("Jon", 15.5, 25.25);
        Employee emp2 = new Employee("Susan", 15.5, 32.0);

        employees.add(emp1);
        employees.add(emp2);

        emp1.punchIn(10.50);
        emp1.punchOut(11.50);

        System.out.println(employees.get(0).getHoursWorked());
    }

    public static void oldStyleDemo()
    {

        String[] employeeNames = new String[2];
        double[] payRates = new double[2];
        double[] hoursWorked = new double[2];
        double[] clockInTimes = new double[2];

        employeeNames[0] = "Jon";
        payRates[0] = 15.50;
        hoursWorked[0] = 25.25;
        clockInTimes[0] = 0.0;

        employeeNames[1] = "Susan";
        payRates[1] = 15.50;
        hoursWorked[1] = 32.0;
        clockInTimes[1] = 0.0;

        // jon clocks in
        clockInTimes[1] = 10.50;
        // jon clocks out
        double timeOut = 11.5;
        hoursWorked[0] += timeOut - clockInTimes[0];

        System.out.println(hoursWorked[0]);
    }
}