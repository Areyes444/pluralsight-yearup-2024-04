package com.pluralsight.models;

public class Sedan extends Vehicle
{
    private boolean isOn;

    public Sedan(String make, String model)
    {
        super(make, model);
        this.isOn = false;
    }

    @Override
    public void repair()
    {
        System.out.println("repairing Sedan ... overrides Vehicle contract");
    }
}
