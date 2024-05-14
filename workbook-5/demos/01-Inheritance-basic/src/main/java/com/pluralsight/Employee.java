package com.pluralsight;

import java.time.LocalDate;

public class Employee extends Person
{
    private LocalDate hireDate;
    private double salary;
    private String department;

    public LocalDate getHireDate()
    {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate)
    {
        this.hireDate = hireDate;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    // methods
    public void earnPayRaise(double percent)
    {
        salary += salary * percent;
        System.out.println("pay raise added in the Employee Class");
    }
}
