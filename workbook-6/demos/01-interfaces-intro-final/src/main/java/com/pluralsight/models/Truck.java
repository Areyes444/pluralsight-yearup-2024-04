package com.pluralsight.models;

public class Truck extends Vehicle
{
    public Truck(String make, String model)
    {
        super(make, model);
    }

    @Override
    public void repair()
    {
        System.out.println("Repairing Truck");
    }
}
