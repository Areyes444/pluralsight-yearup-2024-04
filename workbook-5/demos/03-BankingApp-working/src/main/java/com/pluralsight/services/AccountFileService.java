package com.pluralsight.services;

import com.pluralsight.models.BankAccount;
import com.pluralsight.models.CheckingAccount;
import com.pluralsight.models.SavingsAccount;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountFileService
{
    // read the CSV file
    // and convert the data into an array list
    public static ArrayList<BankAccount> loadAccounts()
    {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File("data/accounts.csv")))
        {
            // skip first line
            scanner.nextLine();

            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] tokens = line.split("\\|");

                String type = tokens[0];
                int accountNumber = Integer.parseInt(tokens[1]);
                String owner = tokens[2];
                double balance = Double.parseDouble(tokens[3]);

                if(type.equals("checking"))
                {
                    BankAccount account = new CheckingAccount(accountNumber, owner, balance);
                    accounts.add(account);
                }
                else
                {
                    BankAccount account = new SavingsAccount(accountNumber, owner, balance);
                    accounts.add(account);
                }
            }
        }
        catch (IOException e)
        {

        }

        return accounts;
    }

    // take an array list
    // and save the data to a CSV file
    public static void saveAccounts(ArrayList<BankAccount> accounts)
    {
        try(PrintWriter writer = new PrintWriter(new File("data/accounts.csv")))
        {
            // add header row
            writer.println("type|acct number|owner|balance");
            for(BankAccount account : accounts)
            {
                String type = "checking";
                if(account instanceof SavingsAccount) type = "savings";

                writer.printf("%s|%d|%s|%f\n", type, account.getAccountNumber(), account.getOwner(), account.getBalance());
            }
        }
        catch (IOException e)
        {
        }
    }
}
