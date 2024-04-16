package com.pluralsight;

import javax.swing.*;
import java.util.Scanner;

public class StringSplitReviewApp2
{
    public static void main(String[] args)
    {

        // Source / Input
        // ask for the name
        String fullName = getFullName();

        // Transformation
        // break name into parts
        String firstName = "";
        String middleName = "";
        String lastName = "";

        // remove the first name from the full name
        int index = fullName.indexOf(" ");
        firstName = fullName.substring(0, index);
        fullName = fullName.substring(index + 1);

        // does fullName still have a space
        index = fullName.indexOf(" ");
        boolean hasMiddleName = index > 0;
        if(hasMiddleName)
        {
            middleName = fullName.substring(0, index);
            lastName = fullName.substring(index + 1);
        }
        else
        {
           lastName = fullName;
        }



        // Destination / Output
        // display the parts
        System.out.println();
        System.out.printf("First Name:  %s \n", firstName );
        System.out.printf("Middle Name: %s \n", middleName );
        System.out.printf("Last Name:   %s \n", lastName );
    }

    public static String getFullName()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        return input.nextLine().strip();
    }
}
