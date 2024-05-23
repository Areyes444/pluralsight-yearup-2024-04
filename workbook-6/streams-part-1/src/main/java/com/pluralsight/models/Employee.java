package com.pluralsight.models;

public class Employee extends Person
{
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary)
    {
        super(firstName, lastName, age);
        this.salary = salary;
    }
    public Employee()
    {
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}
