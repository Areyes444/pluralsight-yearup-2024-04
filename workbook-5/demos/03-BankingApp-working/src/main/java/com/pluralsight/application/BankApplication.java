package com.pluralsight.application;

import com.pluralsight.models.BankAccount;
import com.pluralsight.models.CheckingAccount;
import com.pluralsight.services.AccountFileService;
import com.pluralsight.ui.UserInterface;

import java.util.ArrayList;

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
        BankAccount account = bankAccounts.stream()
                                          .filter(acct -> acct.getAccountNumber() == accountNumber)
                                          .findFirst()
                                          .get();

        double amount = UserInterface.getWithdrawalAmount();
        boolean canWithdraw = account.canWithdraw(amount);
        if(canWithdraw)
        {
            account.withdraw(amount);
            UserInterface.displayMessage(amount + " was withdrawn");
            UserInterface.displayMessage("Remaining Balance: " + account.getBalance());
        }
        else
        {
            UserInterface.displayMessage("Sorry, you don't got enough");
        }
    }
}
