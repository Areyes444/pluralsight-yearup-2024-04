package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main
{
    private static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        String name = getName();
        LocalDate date = getReservationDate();
        int numberOfTickets = getNumberOfTickets();

        String formattedName = formatName(name);
        String ticketWord = numberOfTickets == 1 ? "ticket" : "tickets";

        System.out.printf("%d %s reserved for %s under %s \n", numberOfTickets, ticketWord, date, formattedName);
    }

    private static String formatName(String name)
    {
        String[] words = name.split(" ");
        return words[1] + ", " + words[0];
    }

    public static String getName()
    {
        System.out.print("Please enter your name: ");
        return userInput.nextLine().strip();
    }

    public static LocalDate getReservationDate()
    {
        System.out.print("What date will you be coming (MM/dd/yyyy)? ");
        String dateInput = userInput.nextLine().strip();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.parse(dateInput,formatter);
    }

    public static int getNumberOfTickets()
    {
        System.out.print("How many tickets would you like ");
        return Integer.parseInt(userInput.nextLine().strip());
    }
}