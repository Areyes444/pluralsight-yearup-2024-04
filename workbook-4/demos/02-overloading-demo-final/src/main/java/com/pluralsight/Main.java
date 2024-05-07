package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {
        GuestHistory history = new GuestHistory();

        while(true)
        {
            int choice = askUser();
            ArrayList<Reservation> searchResults;

            int roomNumber;
            LocalDate date;
            String lastName;
            String firstName;

            System.out.println();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the room number: ");
                    roomNumber = userInput.nextInt();
                    userInput.nextLine();
                    searchResults = history.searchForGuest(roomNumber);
                    printReservations(searchResults);
                    break;
                case 2:
                    System.out.print("Enter the date: ");
                    date = LocalDate.parse(userInput.nextLine().strip());
                    searchResults = history.searchForGuest(date);
                    printReservations(searchResults);
                    break;
                case 3:
                    System.out.print("Enter the last name: ");
                    lastName = userInput.nextLine().strip();
                    searchResults = history.searchForGuest(lastName);
                    printReservations(searchResults);
                    break;
                case 4:
                    System.out.print("Enter the last name: ");
                    lastName = userInput.nextLine().strip();
                    System.out.print("Enter the first name: ");
                    firstName = userInput.nextLine().strip();
                    searchResults = history.searchForGuest(lastName, firstName);
                    printReservations(searchResults);
                    break;
                case 5:
                    System.out.print("Enter the room number: ");
                    roomNumber = userInput.nextInt();
                    userInput.nextLine();
                    System.out.print("Enter the date: ");
                    date = LocalDate.parse(userInput.nextLine().strip());
                    searchResults = history.searchForGuest(roomNumber, date);
                    printReservations(searchResults);
                    break;
                case 0:
                    System.out.println("Goodbye");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }


    }

    private static int askUser()
    {
        System.out.println();
        System.out.println("Hotel California");
        System.out.println("----------------------");
        System.out.println("1) Search by room");
        System.out.println("2) Search by date");
        System.out.println("3) Search by last name");
        System.out.println("4) Search by full name");
        System.out.println("5) Search by room and date");
        System.out.println("0) Exit");
        System.out.println("Enter your choice: ");
        return Integer.parseInt(userInput.nextLine().strip());
    }

    private static void printReservations(ArrayList<Reservation> reservations)
    {
        System.out.println();
        for (Reservation reservation : reservations)
        {
            System.out.println(reservation);
        }
    }
}