package com.pluralsight;

public class BankAccount
{
    private int accountNumber;
    private double balance;

    private static double interestRate = 0.05;

    public BankAccount(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public static double getInterestRate()
    {
        return interestRate;
    }

    public static void setInterestRate(double interestRate)
    {
        BankAccount.interestRate = interestRate;
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

    public void payInterest()
    {
        double monthlyInterestRate = interestRate / 12;
        balance += balance * monthlyInterestRate;
    }
}
