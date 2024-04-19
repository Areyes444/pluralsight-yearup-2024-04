package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        // create an array of people here
        Person[] people = {
                new Person("Alice", "Smith", 25),
                new Person("Bob", "Johnson", 30),
                new Person("Charlie", "Williams", 45),
                new Person("Diana", "Brown", 22),
                new Person("Ethan", "Jones", 38)
        };

        int choice = 0;
        while(choice != 5)
        {
            // print the home screen
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("1 - List all people");
            System.out.println("2 - Search by last name");
            System.out.println("3 - Search by age range");
            System.out.println("4 - Add new person");
            System.out.println("5 - Quit");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(userInput.nextLine());

            switch(choice)
            {
                case 1:
                    // list all
                    showAll(people);
                    break;
                case 2:
                    // search by name
                    searchByLastName(people);
                    break;
                case 3:
                    // search by age
                    searchByAge(people);
                    break;
                case 4:
                    // add person
                    people = addPerson(people);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println();
                    System.out.println("Bruh... not an option");
                    break;
            }

            System.out.println();
            System.out.println("Press Enter to continue...");
            userInput.nextLine();

        }


    }

    public static void showAll(Person[] people)
    {
        System.out.println();
        System.out.println("All Athletes");
        System.out.println("----------------------------------------");

        // first    last    age
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.printf("%-10s %-10s %d\n", person.getFirstName(), person.getLastName(), person.getAge());
        }
    }

    public static void searchByLastName(Person[] people)
    {
        System.out.println();
        System.out.println("Search Athletes by Last Name");
        System.out.println("----------------------------------------");
        System.out.print("Enter a last name to search: ");
        String searchName = userInput.nextLine();

        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            if(person.getLastName().equalsIgnoreCase(searchName))
            {
                System.out.printf("%-10s %-10s %d\n", person.getFirstName(), person.getLastName(), person.getAge());
            }
        }
    }

    public static void searchByAge(Person[] people)
    {
        System.out.println();
        System.out.println("Search Athletes by Age");
        System.out.println("----------------------------------------");
    }

    public static Person[] addPerson(Person[] people)
    {
        System.out.println();
        System.out.println("Add Athlete");
        System.out.println("----------------------------------------");
        // get user input

        // create a person

        // add to the list

        return people;
    }
}
