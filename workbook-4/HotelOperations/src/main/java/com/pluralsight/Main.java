package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Room room = new Room(2, 124.00, false, false);

        boolean isAvailable = room.isAvailable();
        System.out.println("Is the room available: " + isAvailable);

        Reservation reservation = new Reservation("king",3,true);
        System.out.println("Total Reservation Cost: " + reservation.getReservationTotal());

        Employee employee = new Employee(1245,"Chester","Front desk",50,55,5,true);
        System.out.println("Total pay for employee: " + employee.getTotalPay());

    }
}