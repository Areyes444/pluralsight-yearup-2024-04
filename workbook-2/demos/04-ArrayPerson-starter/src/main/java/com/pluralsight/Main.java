package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        // create an array of people here


        int choice = 0;
        while(choice != 6)
        {
            // print the home screen
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("1 - List all people");
            System.out.println("2 - Search by lastName");
            System.out.println("3 - Search by age range");
            System.out.println("4 - Add new person");
            System.out.println("5 - Quit");
            System.out.println();
            System.out.println("Enter your choice");
            choice = Integer.parseInt(userInput.nextLine());

            switch(choice)
            {
                case 1:
                    // list all
                    break;
                case 2:
                    // search by name
                    break;
                case 3:
                    // search by age
                    break;
                case 4:
                    // add person
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println();
                    System.out.println("Bruh... not an option");
                    break;
            }

        }


    }

    public static void showAll(Person[] people)
    {
    }

    public static void searchByLastName(Person[] people)
    {
    }

    public static void searchByAge(Person[] people)
    {
    }

    public static void addPerson(Person[] people)
    {
        // get user input

        // create a person

        // add to the list
    }
}
