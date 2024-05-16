package com.pluralsight.ui;

import com.pluralsight.models.BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface
{
    private static Scanner in = new Scanner(System.in);

    public static int getHomeScreenSelection()
    {
        System.out.println();
        System.out.println("Welcome to the bank");
        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println(" 1) withdraw");
        System.out.println(" 2) deposit");
        System.out.println(" 3) transfer");
        System.out.println(" 4) add account");
        System.out.println(" 5) display account balance");
        System.out.println(" 6) display all accounts");
        System.out.println(" 0) exit");
        System.out.print("Enter your selection: ");
        return Integer.parseInt(in.nextLine());
    }

    public static int getAccountNumber()
    {
        System.out.println();
        System.out.print("Please enter the account number: ");
        return Integer.parseInt(in.nextLine());
    }

    public static double getWithdrawalAmount()
    {
        System.out.println();
        System.out.print("Please enter the amount to withdraw: ");
        return Double.parseDouble(in.nextLine());
    }

    public static void displayMessage(String message)
    {
        System.out.println();
        System.out.println(message);
    }

    public static void displayAccounts(ArrayList<BankAccount> accounts)
    {
        System.out.println();
        for(BankAccount account : accounts)
        {
            displayAccount(account);
        }
    }

    public static void displayAccount(BankAccount account)
    {
        System.out.println("-".repeat(50));
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account owner: " + account.getOwner());
        System.out.println("Account balance: " + account.getBalance());
    }
}
