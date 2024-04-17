package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        String name = "Joe Jared Jones";
        int indexOfSpace = name.indexOf(' ');

        String firstName = name.substring(0, indexOfSpace);
        String middleName = "";
        String lastName = "";

        name = name.substring(indexOfSpace + 1);
        indexOfSpace = name.indexOf(' ');
        boolean hasMiddleName = indexOfSpace >= 0;

        if(hasMiddleName)// they have a middle name get the middle name
        {

        }
        else // just get the last name
        {

        }
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}