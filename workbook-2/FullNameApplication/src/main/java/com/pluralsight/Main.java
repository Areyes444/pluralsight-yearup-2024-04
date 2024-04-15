package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

// Asking for first name
        System.out.print("Enter your first Name: ");
        String firstName = userInput.nextLine().strip();

// Asking for middle name
        System.out.print("Enter your middle name (press Enter if you don't have one): ");
        String middleName = userInput.nextLine().strip();

        //Asking for last Name
        System.out.print("Enter your last name: ");
        String lastName = userInput.nextLine().strip();

        //Asking for a suffix in name
        System.out.print("Enter your suffix(Please press Enter if you don't have suffix): ");
        String suffixName = userInput.nextLine().strip();

        //In case there is no middle name
        if(middleName.isEmpty()){
            System.out.println("Your full name is: " +String.format( firstName, lastName,suffixName));
        } else if (suffixName.isEmpty()) {
            System.out.println("Your full name is: " +String.format(firstName, middleName,lastName));

        }else {
         System.out.print(" Error, let's try again ");
         return;
        }
//The Full name results
        System.out.println("Your Full Name: "+String.format("%s %s %s ,%s", firstName, middleName, lastName, suffixName));
    }

}