package com.pluralsight;

public class BankAccount
{
    private final int accountNumber;
    private String name;
    private double balance;

    private static double interestRate = 0.05;

    public BankAccount(int accountNumber, String name, double balance)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // getters / setters
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


    // static  getters/setters
    public static double getInterestRate()
    {
        return interestRate;
    }

    public static void setInterestRate(double interestRate)
    {
        BankAccount.interestRate = interestRate;
    }


    // methods
    public boolean withdraw(double amount)
    {
        if(amount < 0) return false;

        if(amount <= balance)
        {
            balance -= amount;
            return true;
        }

        return false;
    }

    public boolean deposit(double amount)
    {
        if(amount < 0) return false;

        balance += amount;
        return true;
    }
}
