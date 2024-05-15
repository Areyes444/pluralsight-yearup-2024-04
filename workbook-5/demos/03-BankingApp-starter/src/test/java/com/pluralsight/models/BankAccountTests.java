package com.pluralsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTests
{

    @Test
    public void withdraw_shouldDecreaseBalance_byWithdrawalAmount()
    {
        // arrange
        BankAccount account = new BankAccount(123, "Angelica", 5000);
        double withdrawalAmount = 500;
        double expectedNewBalance = 4500;

        // act
        double actualReturnValue = account.withdraw(withdrawalAmount);

        // assert -- verify that the action did what it was supposed to do
        // verify that the withdraw() method returned the expected amount
        assertEquals(expectedNewBalance, actualReturnValue, "Because the account had $5000 and I withdrew $500");

        // check if the balance actually got updated
        double actualNewBalance = account.getBalance();
        assertEquals(expectedNewBalance, actualNewBalance, "Because the account had $5000 and I withdrew $500");
    }

    @Test
    public void deposit_shouldIncreaseBalance_byDepositAmount()
    {
        // arrange
        BankAccount account = new BankAccount(123, "Angelica", 5000);
        double withdrawalAmount = 500;
        double expectedNewBalance = 5500;

        // act
        double actualReturnValue = account.deposit(withdrawalAmount);

        // assert -- verify that the action did what it was supposed to do
        // verify that the deposit() method returned the expected amount
        assertEquals(expectedNewBalance, actualReturnValue, "Because the account had $5000 and I deposited $500");

        // check if the balance actually got updated
        double actualNewBalance = account.getBalance();
        assertEquals(expectedNewBalance, actualNewBalance, "Because the account had $5000 and I deposited $500");
    }
}