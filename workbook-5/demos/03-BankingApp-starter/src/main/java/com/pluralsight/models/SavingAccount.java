package com.pluralsight.models;

public class SavingAccount extends BankAccount
{
    private static final double MINIMUM_BALANCE = 25;

    public SavingAccount(int accountNumber, String owner, double balance)
    {
        super(accountNumber, owner, balance);
    }


    @Override
    public boolean canWithdraw(double amount)
    {
        double newBalance = getBalance() - amount;
        return newBalance >= MINIMUM_BALANCE;
    }

    @Override
    public double withdraw(double amount)
    {
        if(canWithdraw(amount))
        {
            return super.withdraw(amount);
        }
        return getBalance();
    }
}
