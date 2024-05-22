package com.pluralsight.models;

import com.pluralsight.models.interfaces.Cleaner;
import com.pluralsight.models.interfaces.Movable;

public class Roomba implements Movable, Cleaner
{
    @Override
    public void clean()
    {
        System.out.println("Roomba is now cleaning");
    }

    @Override
    public Point move(int x, int y)
    {
        System.out.printf("Moving Roomba right by %d and up by %d\n", x, y);
        return null;
    }

    @Override
    public void moveTo(Point point)
    {
        System.out.printf("Moving Roomba to point (%d, %d)\n", point.getX(), point.getY());
    }

    @Override
    public void goHome()
    {
        System.out.println("Moving Roomba to charging station");
    }
}
