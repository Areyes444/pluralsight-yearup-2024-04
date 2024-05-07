package com.pluralsight;

public class Room
{
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty)
    {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds()
    {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds)
    {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public boolean isOccupied()
    {
        return isOccupied;
    }

    public void setOccupied(boolean occupied)
    {
        isOccupied = occupied;
    }

    public boolean isDirty()
    {
        return isDirty;
    }

    public void setDirty(boolean dirty)
    {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return !isDirty() && !isOccupied();
    }

    public void checkIn()
    {
        if(!isOccupied)
        {
            isOccupied = true;
            isDirty = true;
        } else {
            System.out.println( "Room is not available.");
        }
    }

    public void checkOut()
    {
        if(isOccupied)
        {
            isOccupied = false;
        } else{
            System.out.println("Room can not be checked out.");
        }
    }

    public void cleanRoom()
    {
        if(isDirty)
        {
            isDirty= false;
            System.out.println("Room has been cleaned successfully.");
        }else{
            System.out.println("Room does not need to be cleaned.");
        }
    }

}
