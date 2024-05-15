package com.pluralsight.models;

public class BankAccount
{
    private int accountNumber;
    private String owner;
    private double balance;

    public BankAccount(int accountNumber, String owner, double balance)
    {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public String getOwner()
    {
        return owner;
    }

    public double getBalance()
    {
        return balance;
    }

    public double withdraw(double amount)
    {
        balance -= amount;
        return balance;
    }

    public double deposit(double amount)
    {
        balance += amount;
        return balance;
    }

    public boolean canWithdraw(double amount)
    {
        return true;
    }
}
