package com.pluralsight;

public class Reservation
{
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend)
    {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType()
    {
        return roomType;
    }

    public void setRoomType(String roomType)
    {
        this.roomType = roomType;
    }

    public int getNumberOfNights()
    {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights)
    {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend()
    {
        return isWeekend;
    }

    public void setWeekend(boolean weekend)
    {
        isWeekend = weekend;
    }

    public double getPrice()
    {
        double pricePerNight = 0;

        if (roomType.equalsIgnoreCase("king")) {
            pricePerNight = 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            pricePerNight = 124;
        } else System.out.println("No room with that type: " + roomType);


        if(isWeekend()){
            pricePerNight *= 1.1;
        }
        return pricePerNight;
    }

    public double getReservationTotal()
    {
        double pricePerNight = getPrice();
        return pricePerNight * numberOfNights;
    }
}
