package com.pluralsight;

public class BankAccount
{
    private final int accountNumber;
    private String name;
    private double balance;

    public BankAccount(int accountNumber, String name, double balance)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public double getBalance()
    {
        return balance;
    }

    public boolean withdraw(double amount)
    {
        //if(amount <0) return false (can also work)
        if(amount <= balance && amount >0)
        {
            balance -= amount;
            return true;
        }

        return false;
    }

    public boolean deposit(double amount)
    {
        if (amount <0) return false;

        balance += amount;
        return true;
    }
}
