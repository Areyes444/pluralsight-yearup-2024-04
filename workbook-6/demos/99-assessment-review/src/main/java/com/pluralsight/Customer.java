package com.pluralsight;

public class Customer extends Person
{
    private int customerId;

    public Customer(String firstName, String lastName, int customerId)
    {
        super(firstName, lastName);

        this.customerId = customerId;
    }

    public Customer()
    {
    }

    @Override
    public String getFullName()
    {
        return super.getFullName() + " (" + customerId + ")";
    }
}
