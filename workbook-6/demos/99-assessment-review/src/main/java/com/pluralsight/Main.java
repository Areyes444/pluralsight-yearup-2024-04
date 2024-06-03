package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        BankAccount b1 = new BankAccount(123, 500.00);
        BankAccount b2 = new BankAccount(456, 500.00);

        System.out.println(b1.getBalance());
        System.out.println(b2.getBalance());

        BankAccount.setInterestRate(.06);

        b1.payInterest();
        b2.payInterest();

        System.out.println(b1.getBalance());
        System.out.println(b2.getBalance());
    }
}