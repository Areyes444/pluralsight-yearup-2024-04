package com.pluralsight.application;

import com.pluralsight.models.BankAccount;
import com.pluralsight.models.CheckingAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankApplicationTests
{
    BankApplication app;

    @BeforeEach
    public void setup()
    {
        app = new BankApplication();
    }

    @Test
    public void search_shouldReturn_bankAccountWithValidNumber()
    {
        // arrange
        int accountNumber = 1001;

        // act
        BankAccount bankAccount = app.search(accountNumber);

        // assert
        assertNotNull(bankAccount);
        assertTrue(bankAccount instanceof CheckingAccount);
    }
}