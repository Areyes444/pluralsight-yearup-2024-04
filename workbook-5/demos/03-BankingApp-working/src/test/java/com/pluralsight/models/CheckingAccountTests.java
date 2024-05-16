package com.pluralsight.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTests
{
    private CheckingAccount account;

    @BeforeEach
    public void setup()
    {
        account = new CheckingAccount(456, "Julian", 5000);
    }

    @Test
    public void canWithdraw_shouldReturnFalse_ifWithdrawalAmount_isTooHigh()
    {
        // arrange
        double withdrawalAmount = 6000;

        // act
        boolean canWithdraw = account.canWithdraw(withdrawalAmount);

        // arrange
        assertFalse(canWithdraw, "Because the checking account had a balance of $5000, and I tried to withdraw $6000. $500 overdraft limit");
    }

    @Test
    public void canWithdraw_shouldReturnTrue_ifNewBalanceEqualsMaxOverdraft()
    {
        // arrange
        double withdrawalAmount = 5500;

        // act
        boolean canWithdraw = account.canWithdraw(withdrawalAmount);

        // arrange
        assertTrue(canWithdraw, "Because the checking account had a balance of $5000, and I tried to withdraw $5500. $500 overdraft limit");
    }



    @Test
    public void withdraw_shouldDecreaseBalance_whenWithdrawalAmountValid()
    {
        // arrange
        double withdrawalAmount = 5500;
        double expectedNewBalance = -500;

        // act
        double actualReturnValue = account.withdraw(withdrawalAmount);

        // arrange
        assertEquals(expectedNewBalance, actualReturnValue,"Because the checking account had a balance of $5000, and I tried to withdraw $5500. $500 overdraft limit");
    }

}