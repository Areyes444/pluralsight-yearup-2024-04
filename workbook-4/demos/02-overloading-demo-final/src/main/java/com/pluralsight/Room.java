package com.pluralsight;

public class Room
{
    private int roomNumber;
    private int numberOfBeds;
    private String roomType;
    private double price;

    public Room(int roomNumber)
    {
        this.roomNumber = roomNumber;
        if(roomNumber < 111)
        {
            numberOfBeds = 1;
            roomType = "King Suite";
            price = 159.00;
        }
        else {
            numberOfBeds = 2;
            roomType = "Double Queen";
            price = 144.00;
        }
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public int getNumberOfBeds()
    {
        return numberOfBeds;
    }

    public String getRoomType()
    {
        return roomType;
    }

    public double getPrice()
    {
        return price;
    }
}
