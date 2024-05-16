package com.pluralsight.models;

public class Triangle extends Shape
{
    private int base;
    private int height;

    public Triangle(int base, int height)
    {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    public int getBase()
    {
        return base;
    }

    public int getHeight()
    {
        return height;
    }

    @Override
    public double getArea()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return String.format("%s (base: %d, height: %d): %f", getName(), base, height, getArea());
    }
}
