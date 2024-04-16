package com.pluralsight;

import java.util.Scanner;

public class StringSplitReviewApp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // ask for the name
        System.out.print("Please enter your name: ");
        String fullName = input.nextLine().strip();

        // break name into parts
        String firstName = "";
        String middleName = "";
        String lastName = "";

        String[] nameParts = fullName.split(" ");

        firstName = nameParts[0];

        boolean hasMiddleName = nameParts.length > 2;
        if(hasMiddleName)
        {
            middleName = nameParts[1];
            lastName = nameParts[2];
        }
        else
        {
            lastName = nameParts[1];
        }

        // display the parts
        System.out.println();
        System.out.printf("First Name: %s \n", firstName );
        System.out.printf("Middle Name: %s \n", middleName );
        System.out.printf("Last Name: %s \n", lastName );
    }
}
