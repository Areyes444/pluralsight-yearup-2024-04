package com.pluralsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTests
{

    @Test
    public void withdraw_shouldDecreaseBalance_byWithdrawalAmount()
    {
        // arrange
        BankAccount account = new CheckingAccount(123, "Angelica", 5000);
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
        BankAccount account = new CheckingAccount(123, "Angelica", 5000);
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

    @Test
    public void transfer_shouldMoveMoney_fromOneAccount_toAnother()
    {
        // arrange
        BankAccount fromAccount = new SavingsAccount(123, "Angelica", 5000);
        BankAccount toAccount = new CheckingAccount(456, "Fahd", 5000);

        // act
        boolean transferSucceeded = fromAccount.transfer(toAccount, 500);

        // assert
        // check if the transfer() method returned true/false
        assertTrue(transferSucceeded, "Because $500 should have been moved from Angelica's account to Fhad's");

        double expectedFromBalance = 4500;
        double actualFromBalance = fromAccount.getBalance();
        assertEquals(expectedFromBalance, actualFromBalance, "Because $500 should have been moved from Angelica's account");

        double expectedToBalance = 5500;
        double actualToBalance = toAccount.getBalance();
        assertEquals(expectedToBalance, actualToBalance, "Because $500 should have been moved to Fahd's account");
    }

    @Test
    public void transfer_shouldNotMoveMoney_whenSavingsAccount_hasInsufficientFunds()
    {
        // arrange
        BankAccount fromAccount = new SavingsAccount(123, "Guy", 5000);
        BankAccount toAccount = new CheckingAccount(456, "Guy", 1000);

        // act
        boolean transferSucceeded = fromAccount.transfer(toAccount, 5000);

        // assert
        // check if the transfer() method returned true/false
        assertFalse(transferSucceeded, "Because a savings account has a minimum balance of $25");

        double expectedFromBalance = 5000;
        double actualFromBalance = fromAccount.getBalance();
        assertEquals(expectedFromBalance, actualFromBalance, "Because no money should have been transferred");

        double expectedToBalance = 1000;
        double actualToBalance = toAccount.getBalance();
        assertEquals(expectedToBalance, actualToBalance, "Because no money should have been transferred");
    }
}