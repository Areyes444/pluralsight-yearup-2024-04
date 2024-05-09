package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest
{

    @Test
    public void withdraw_shouldSucceed_whenCurrentBalance_isGreaterThanWithdrawal()
    {
        // arange
        BankAccount account = new BankAccount(123, "Jordan", 100.00);

        // act
        boolean isSuccessful = account.withdraw(50.00);

        // assert
        assertTrue(isSuccessful, "Because the account had a balance of $100 and the withdrawal was for $50");
        double expectedBalance = 50.00;
        double actualBalance = account.getBalance();
        assertEquals(expectedBalance, actualBalance, "Because the account had a balance of $100 and the withdrawal was for $50");
    }

    @Test
    public void withdraw_shouldFail_whenCurrentBalance_isLessThanWithdrawal()
    {
        // arange
        BankAccount account = new BankAccount(123, "Jordan", 100.00);

        // act
        boolean isSuccessful = account.withdraw(150.00);

        // assert
        assertFalse(isSuccessful, "Because the account had a balance of $100 and the withdrawal was for $150");
        double expectedBalance = 100.00;
        double actualBalance = account.getBalance();
        assertEquals(expectedBalance, actualBalance, "Because the balance should not change if the withdrawal failed");
    }

    @Test
    public void withdraw_shouldSucceed_whenCurrentBalance_isSameAsWithdrawal()
    {
        // arange
        BankAccount account = new BankAccount(123, "Jordan", 100.00);

        // act
        boolean isSuccessful = account.withdraw(100.00);

        // assert
        assertTrue(isSuccessful, "Because the withdrawal was for the same amount of the current balance");
        double expectedBalance = 0.00;
        double actualBalance = account.getBalance();
        assertEquals(expectedBalance, actualBalance, "Because the withdrawal was for the same amount of the current balance");
    }


    @Test
    public void withdraw_shouldNotSucceed_forNegativeAmount()
    {
        // arrange
        BankAccount account = new BankAccount(123, "Jordan", 100.00);

        // act
        boolean isSuccessful = account.withdraw(-100.00);

        // assert
        assertFalse(isSuccessful, "Because we tried to withdraw a negative amount");
        double expectedBalance = 100.00;
        double actualBalance = account.getBalance();
        assertEquals(expectedBalance, actualBalance, "Because the current balance should be the same as the starting balance when attempting to withdraw a negative amount");
    }


    // deposit tests

    @Test
    public void deposit_shouldSucceed_andBalanceShouldIncrese_byTheDepositAmount()
    {
        // arrange
        BankAccount account = new BankAccount(123, "Jordan", 100.00);

        // act
        boolean isSuccessful = account.deposit(100.00);

        // assert
        assertTrue(isSuccessful, "Because we deposited $100");
        double expectedBalance = 200.00;
        double actualBalance = account.getBalance();
        assertEquals(expectedBalance, actualBalance, "Because the starting balance was $100, and we deposited $100");
    }


    @Test
    public void deposit_shouldNotSucceed_forNegativeAmount()
    {
        // arrange
        BankAccount account = new BankAccount(123, "Jordan", 100.00);

        // act
        boolean isSuccessful = account.deposit(-100.00);

        // assert
        assertFalse(isSuccessful, "Because we tried to deposit a negative amount");
        double expectedBalance = 100.00;
        double actualBalance = account.getBalance();
        assertEquals(expectedBalance, actualBalance, "Because the current balance should be the same as the starting balance when attempting to deposit a negative amount");
    }

}