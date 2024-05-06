package com.pluralsight.ui;

import com.pluralsight.models.Transaction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// this is the VIEW of the MVC pattern
// all user input and output logic should be here
public class UserInterface
{
    private Scanner userInput = new Scanner(System.in);

    public int getHomeScreenSelection()
    {
        return 0;
    }

    public void displayTransactions(ArrayList<Transaction> transactions)
    {
        // loop to display the transactions
    }
}
