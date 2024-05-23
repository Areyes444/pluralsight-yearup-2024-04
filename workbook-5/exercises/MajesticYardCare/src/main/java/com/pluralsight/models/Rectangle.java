package com.pluralsight.models;

public class Rectangle extends Shape
{
    private double width;
    private double height;


    public Rectangle(double width, double height)
    {
        super("Rectangle");

        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, double width, double height)
    {
        super(name);

        this.width = width;
        this.height = height;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    @Override
    public double getArea()
    {
        return 0.0;
    }

    @Override
    public String toString()
    {
        return String.format("%s (%d x %d): %f", getName(), width, height, getArea());
    }
}
