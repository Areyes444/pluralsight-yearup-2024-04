package com.pluralsight.application;

import com.pluralsight.models.BankAccount;
import com.pluralsight.models.CheckingAccount;
import com.pluralsight.services.AccountFileService;
import com.pluralsight.ui.UserInterface;

import java.util.ArrayList;
import java.util.Optional;

public class BankApplication
{
    private ArrayList<BankAccount> bankAccounts;

    public BankApplication()
    {
        bankAccounts = AccountFileService.loadAccounts();
    }

    public void run()
    {
        while(true)
        {
            int choice = UserInterface.getHomeScreenSelection();

            switch(choice)
            {
                case 1: // withdraw
                    // search by account number
                    // withdraw money from the account
                    withdraw();
                    break;
                case 2: // deposit
                    // search by account number
                    // deposit money into the account
                    break;
                case 3: // transfer
                    // search for BOTH accounts
                    // transfer money from one account to another
                    break;
                case 4: // create new account
                    // prompt user for account information
                    // add a new account to the list
//                    bankAccounts.add(new CheckingAccount(1003, "Syd", 8888.88));
                    break;
                case 5: // display balance
                    // search for account
                    // display account information and balance
                    break;
                case 6: // display all
                    UserInterface.displayAccounts(bankAccounts);
                    break;
                case 0:
                    // write to file
                    AccountFileService.saveAccounts(bankAccounts);
                    return;
            }
        }

    }

    public void withdraw()
    {
        int accountNumber = UserInterface.getAccountNumber();

        BankAccount account = search(accountNumber);

        if(account != null)
        {
            double amount = UserInterface.getWithdrawalAmount();

            if (withdraw(account, amount))
            {
                UserInterface.displayMessage(amount + " was withdrawn");
                UserInterface.displayAccount(account);
            }
            else
            {
                UserInterface.displayMessage("Sorry, you don't got enough");
            }
        }
        else
        {
            UserInterface.displayMessage("Account number " + accountNumber + " was not found");
        }
    }

    public boolean withdraw(BankAccount account, double amount)
    {
        boolean canWithdraw = account.canWithdraw(amount);
        if (canWithdraw)
        {
            account.withdraw(amount);
            return true;
        }
        return false;
    }

    public BankAccount search(int accountNumber)
    {
        Optional<BankAccount> searchResult = bankAccounts.stream()
                .filter(acct -> acct.getAccountNumber() == accountNumber)
                .findFirst();

        if(searchResult.isPresent())
        {
            return searchResult.get();
        }

        return null;
    }
}
