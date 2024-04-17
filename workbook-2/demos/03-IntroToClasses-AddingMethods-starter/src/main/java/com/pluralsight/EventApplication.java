package com.pluralsight;

import java.util.Scanner;

public class EventApplication
{
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        Person eventGoer = register();

        greetGuest(eventGoer);
    }

    public static Person register()
    {
        // declare variables
        String fullName, firstName, lastName;
        int age;

        // get user input
        System.out.print("Please enter your full name: ");
        fullName = userInput.nextLine();
        System.out.print("Please enter your age: ");
        age = userInput.nextInt();
        userInput.nextLine(); // clears the memory stream

        // get the first and last names
        String[] names = fullName.split(" ");
        firstName = names[0];
        lastName = names[1];

        // create a person
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);

        return person;
    }

    public static void greetGuest(Person guest)
    {
        System.out.println();
        System.out.printf("Welcome %s %s", guest.getFirstName(), guest.getLastName());

    }
}