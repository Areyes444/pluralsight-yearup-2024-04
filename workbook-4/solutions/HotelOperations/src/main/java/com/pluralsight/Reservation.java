package com.pluralsight;

public class Reservation
{
    private final double KING_PRICE = 139.00;
    private final double DOUBLE_PRICE = 124.00;
    private final double WEEKEND_RATE = 0.10;

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

    // derived
    public double getPrice()
    {
        if(isWeekend)
        {
           if(roomType.equalsIgnoreCase("king")){
               return KING_PRICE + (KING_PRICE * WEEKEND_RATE);
           }
           else {
               return DOUBLE_PRICE + (DOUBLE_PRICE * WEEKEND_RATE);
           }
        }
        else
        {
            if(roomType.equalsIgnoreCase("king"))
            {
                return KING_PRICE;
            }
            else {
                return DOUBLE_PRICE;
            }
        }
    }

    public double getReservationTotal()
    {
        return getPrice() * numberOfNights;
    }
}
