package com.pluralsight;

import javax.swing.*;

public class Person
{
    // PRIVATE variables
    private String firstName;
    private String lastName;
    private int age;

    // constructors
    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // getters and setters
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }


    // derived or calculated getter
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
}
