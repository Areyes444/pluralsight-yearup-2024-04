package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        String fullName;
        String firstName = "";
        String middleName = "";
        String lastName = "";

        System.out.print("Please enter your name: ");
        fullName = userInput.nextLine().strip();

        String[] words = fullName.split(" ");
        firstName = words[0];
        if(words.length > 2)
        {
            middleName = words[1];
            lastName = words[2];
        }
        else
        {
            lastName = words[1];
        }

        System.out.println();
        System.out.println("First name:   " + firstName);
        System.out.println("Middle name:  " + middleName);
        System.out.println("Last name:    " + lastName);
    }
}