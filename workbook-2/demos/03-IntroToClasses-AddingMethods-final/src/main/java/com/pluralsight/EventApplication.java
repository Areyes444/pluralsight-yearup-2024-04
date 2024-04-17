package com.pluralsight;

import java.util.Scanner;

public class EventApplication
{
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {

        Person eventGoer = register();

        greetGuest(eventGoer);

        displayGuestInfo(eventGoer);

        System.out.println();
        work(eventGoer);
        eventGoer.eat();
        work(eventGoer);

        displayGuestInfo(eventGoer);
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
        Person person = new Person(firstName, lastName, age);
//        Person person = new Person();
//        person.setFirstName(firstName);
//        person.setLastName(lastName);
//        person.setAge(age);

        return person;
    }

    public static void greetGuest(Person guest)
    {
        System.out.println();
        System.out.printf("Welcome %s %s \n", guest.getFirstName(), guest.getLastName());

    }

    public static void displayGuestInfo(Person guest)
    {
        System.out.println();
        System.out.println("Guest information");
        System.out.println("---------------------");
        System.out.println("First Name: " + guest.getFirstName());
        System.out.println("Last Name:  " + guest.getLastName());
        System.out.println("Age:        " + guest.getAge());
        System.out.println("Energy:     " + guest.getEnergy() + " %");

    }

    public static void work(Person guest)
    {
        System.out.print("How long will you work (in hours): ");
        int hours = userInput.nextInt();
        guest.work(hours);
    }
}