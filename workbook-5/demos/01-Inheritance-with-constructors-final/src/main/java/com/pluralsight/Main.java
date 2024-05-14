package com.pluralsight;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person(1, "John", "Doe", LocalDate.of(2000, 1, 1));
        Employee employee = new Employee(2, "Jane", "Doe", LocalDate.of(1999, 12, 1), LocalDate.of(2020,01,01),175000, "Software Engineering");


//        person.setId(1);
//        person.setFirstName("John");
//        person.setLastName("Doe");
//        person.setBirthDate(LocalDate.parse("2000-01-01"));
        System.out.println(person.getFirstName());

//        employee.setId(2);
//        employee.setFirstName("Jane");
//        employee.setLastName("Doe");
//        employee.setBirthDate(LocalDate.parse("1999-12-01"));
//        employee.setHireDate(LocalDate.parse("2020-01-01"));
//        employee.setSalary(175000);
//        employee.setDepartment("Software Engineering");

        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " was hired on " + employee.getHireDate() + " in " + employee.getDepartment());
        System.out.println(employee.getSalary());
        employee.haveLunch();
        employee.earnPayRaise(.1);
        System.out.println(employee.getSalary());
    }
}