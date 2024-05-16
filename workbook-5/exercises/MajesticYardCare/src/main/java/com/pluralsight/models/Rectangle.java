package com.pluralsight.models;

public class Rectangle extends Shape
{
    private int width;
    private int height;


    public Rectangle(int width, int height)
    {
        super("Rectangle");

        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, int width, int height)
    {
        super(name);

        this.width = width;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
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
