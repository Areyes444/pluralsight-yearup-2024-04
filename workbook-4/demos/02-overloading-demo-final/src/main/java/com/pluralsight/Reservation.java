package com.pluralsight;

import java.time.LocalDate;

public class Reservation
{
    private int reservationNumber;
    private String firstName;
    private String lastName;
    private LocalDate reservationDate;
    private Room room;

    public Reservation(int reservationNumber, String firstName, String lastName, LocalDate reservationDate, int roomNumber)
    {
        this.reservationNumber = reservationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.reservationDate = reservationDate;
        this.room = new Room(roomNumber);
    }

    public int getReservationNumber()
    {
        return reservationNumber;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public LocalDate getReservationDate()
    {
        return reservationDate;
    }

    public Room getRoom()
    {
        return room;
    }

    public String toString()
    {
        return String.format("%s - %d - %s, %s", reservationDate, getRoom().getRoomNumber(), firstName, lastName);
    }
}
