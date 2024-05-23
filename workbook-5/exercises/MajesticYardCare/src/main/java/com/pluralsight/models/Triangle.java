package com.pluralsight.models;

public class Triangle extends Shape
{
    private double base;
    private double height;

    public Triangle(double base, double height)
    {
        super("triangle");
        this.base = base;
        this.height = height;
    }

    public double getBase()
    {
        return base;
    }

    public double getHeight()
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
