package com.pluralsight.models;

public class CheckingAccount extends BankAccount
{
    private static final double MAX_OVERDRAFT = 500;

    public CheckingAccount(int accountNumber, String owner, double balance)
    {
        super(accountNumber, owner, balance);
    }

    @Override
    public boolean canWithdraw(double amount)
    {
        double newBalance = getBalance() - amount;
        return newBalance >= -MAX_OVERDRAFT;
    }

    @Override
    public double withdraw(double amount)
    {
        if(canWithdraw(amount))
        {
            // call the withdraw() method of the parent
            return super.withdraw(amount);
        }

        return getBalance();
    }

}
