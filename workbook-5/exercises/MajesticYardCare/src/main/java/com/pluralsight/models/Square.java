package com.pluralsight.models;

public class Square extends Rectangle
{
    public Square(int sideLength)
    {
        super("Square", sideLength, sideLength);
    }

    @Override
    public double getArea()
    {
        return 0.0;
    }
}
