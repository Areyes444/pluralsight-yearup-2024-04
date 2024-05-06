package com.pluralsight.application;

import com.pluralsight.models.Transaction;
import com.pluralsight.services.TransactionManager;
import com.pluralsight.ui.UserInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;

// this is my controller
// THE ONLY thing I do here is manage the flow of the application
// THERE are NO System.out.print statements here
// I get NO user input here
public class LedgerApplication
{
    private TransactionManager transactionManager = new TransactionManager();
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private UserInterface ui = new UserInterface();

    public void run()
    {
        while (true)
        {
            int choice = ui.getHomeScreenSelection();
        }
    }

}
