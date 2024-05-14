package com.pluralsight;

import java.time.LocalDate;

public class Employee extends Person
{
    private LocalDate hireDate;
    private double salary = 0;
    private String department;

    public Employee(int id, String firstName, String lastName, LocalDate birthDate,
                    LocalDate hireDate, double salary, String department)
    {
        // super = the parent class (Person)
        super(id, firstName, lastName, birthDate);

        this.hireDate = hireDate;
        this.salary = salary;
        this.department = department;
    }

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
