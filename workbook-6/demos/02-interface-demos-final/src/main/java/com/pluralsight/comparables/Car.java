package com.pluralsight.comparables;

public class Car implements Comparable<Car>
{
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public int compareTo(Car other)
    {
        if (this.year != other.getYear())
            return this.year - other.getYear();

        return this.make.compareTo(other.getMake());
    }
}
