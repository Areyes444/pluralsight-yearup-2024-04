package com.pluralsight.ui;

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
}
