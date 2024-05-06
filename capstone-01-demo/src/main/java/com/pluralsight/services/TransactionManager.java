package com.pluralsight.services;

import com.pluralsight.models.Transaction;

import java.util.ArrayList;

// services do the work of either getting the models or saving them
public class TransactionManager
{
    public ArrayList<Transaction> loadTransactions()
    {
        // this is where I would read from the CSV file
        return new ArrayList<>();
    }

    public void writeTransaction(Transaction transaction)
    {
        // write to the csv file here
    }
}
