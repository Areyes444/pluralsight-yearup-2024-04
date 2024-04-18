package com.pluralsight;

public class Customer
{
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(){}

    // getters setters

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

    // derived property
    public String getFullName()
    {
        return lastName + ", " + firstName;
    }
}
