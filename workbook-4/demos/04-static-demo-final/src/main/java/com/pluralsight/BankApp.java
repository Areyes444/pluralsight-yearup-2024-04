package com.pluralsight;

public class BankApp
{
    public static void main(String[] args)
    {
        BankAccount acct1 = new BankAccount(109, "Bob", 750);
        BankAccount acct2 = new BankAccount(45, "45", 1000);

        System.out.println("Current Interest Rate: " + BankAccount.getInterestRate());
        BankAccount.setInterestRate(.025);

        System.out.println("The NEW Interest Rate: " + BankAccount.getInterestRate());
        System.out.println(acct1.getName() + " has $" + acct1.getBalance());
        System.out.println(acct2.getName() + " has $" + acct2.getBalance());

    }
}
