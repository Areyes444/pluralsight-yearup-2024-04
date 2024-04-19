package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication
{
    private static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        String firstName;
        String middleName;
        String lastName;
        String suffix;

        String fullName;

        System.out.println();
        firstName = getUserInput("First name: ");
        middleName = getUserInput("Middle name: ");
        lastName = getUserInput("Last name: ");
        suffix = getUserInput("Suffix: ");

        fullName = formatName(firstName, middleName, lastName, suffix);

        System.out.println();
        System.out.println("Full name: " + fullName);

    }

    public static String getUserInput(String message)
    {
        System.out.print(message);
        return userInput.nextLine().strip();
    }

    private static String formatName(String firstName, String middleName, String lastName, String suffix)
    {
        String fullName = firstName;
        if(!middleName.isEmpty())
        {
            fullName += " " + middleName;
        }
        fullName += " " + lastName;
        if(!suffix.isEmpty())
        {
            fullName += ", " + suffix;
        }

        return fullName;
    }
}