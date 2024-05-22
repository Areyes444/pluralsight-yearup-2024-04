package com.pluralsight.models;

import com.pluralsight.models.interfaces.Valuable;

public class BankAccount implements Valuable
{
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance)
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

    public double deposit(double amount)
    {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount)
    {
        balance -= amount;
        return balance;
    }

    @Override
    public double getValue()
    {
        return balance;
    }
}
