package com.pluralsight.models;

import com.pluralsight.models.interfaces.Valuable;

public class CreditCard implements Valuable
{
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public double charge(double amount)
    {
        balance += amount;
        return balance;
    }

    public double pay(double amount)
    {
        if(amount > balance)
            balance = 0;
        else
            balance -= amount;

        return balance;
    }

    @Override
    public double getValue()
    {
        return -balance;
    }
}
