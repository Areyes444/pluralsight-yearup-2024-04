package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GuestHistory
{
    private ArrayList<Reservation> reservations;

    public GuestHistory()
    {
        loadReservationHistory();
    }

    private void loadReservationHistory()
    {
        reservations = new ArrayList<>();

        File file = new File("files/reservations.csv");
        try(Scanner fileScanner = new Scanner(file))
        {
            fileScanner.nextLine();

            while(fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                String[] tokens = line.split("\\|");

                int id = Integer.parseInt(tokens[0]);
                String firstName = tokens[1];
                String lastName = tokens[2];
                LocalDate reservationDate = LocalDate.parse(tokens[3]);
                int roomNumber = Integer.parseInt(tokens[4]);

                Reservation reservation = new Reservation(id, firstName, lastName, reservationDate, roomNumber);
                reservations.add(reservation);
            }

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        Collections.sort(reservations, new Comparator<Reservation>() {
            @Override
            public int compare(Reservation r1, Reservation r2) {
                return r1.getReservationDate().compareTo(r2.getReservationDate());
            }
        });
    }

    public ArrayList<Reservation> getAllReservations()
    {
        return reservations;
    }

    // search by room number
    public ArrayList<Reservation> searchForGuest(int roomNumber)
    {
        return searchForGuest(null, null, null, roomNumber);
    }

    // search by reservation date
    public ArrayList<Reservation> searchForGuest(LocalDate reservationDate)
    {
        return searchForGuest(null, null, reservationDate, null);

    }

    // search by room and reservation date
    public ArrayList<Reservation> searchForGuest(int roomNumber, LocalDate reservationDate)
    {
        return searchForGuest(null, null, reservationDate, roomNumber);

    }

    // search by last name
    public ArrayList<Reservation> searchForGuest(String lastName)
    {
        return searchForGuest(lastName, null, null, null);

    }

    // search by last and first name
    public ArrayList<Reservation> searchForGuest(String lastName, String firstName)
    {
        return searchForGuest(lastName, firstName, null, null);
    }

    public ArrayList<Reservation> searchForGuest(String lastName, String firstName, LocalDate reservationDate, Integer roomNumber)
    {
        // using streams to filter
        ArrayList<Reservation> filtered =  (ArrayList<Reservation>) reservations.stream()
                                                                                .filter(r -> lastName == null || r.getLastName().equalsIgnoreCase(lastName))
                                                                                .filter(r -> firstName == null || r.getLastName().equalsIgnoreCase(firstName))
                                                                                .filter(r -> reservationDate == null || r.getReservationDate().equals(reservationDate))
                                                                                .filter(r -> roomNumber == null || r.getRoom().getRoomNumber() == roomNumber)
                                                                                .collect(Collectors.toList());

        return filtered;



//        // traditional loop
//        ArrayList<Reservation> filteredReservations = new ArrayList<>();
//
//        for(Reservation reservation : reservations)
//        {
//            if ( (lastName == null || reservation.getLastName().equals(lastName))
//                && (firstName == null || reservation.getFirstName().equals(firstName))
//                && (reservationDate == null || reservation.getReservationDate().equals(reservationDate))
//                && (roomNumber == null || reservation.getRoom().getRoomNumber() == roomNumber)
//            )
//            {
//                filteredReservations.add(reservation);
//            }
//        }
//
//        return filteredReservations;

    }
}
