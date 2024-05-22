package com.pluralsight.models;

import com.pluralsight.models.interfaces.Movable;

public class Robot implements Movable
{
    @Override
    public Point move(int x, int y)
    {
        System.out.printf("Moving Robot right by %d and up by %d\n", x, y);
        return null;
    }

    @Override
    public void moveTo(Point point)
    {
        System.out.printf("Moving Robot to point (%d, %d)\n", point.getX(), point.getY());
    }

    @Override
    public void goHome()
    {
        System.out.println("Moving Robot to charging station");
    }
}
