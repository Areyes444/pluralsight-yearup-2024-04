package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

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
}
