package com.pluralsight.controllers.enumerations;

public enum HomeOptions
{
    ORDER("Order"), EXIT("Exit");

    private final String val;

    HomeOptions(String val)
    {
        this.val = val;
    }

    @Override
    public String toString()
    {
        return val;
    }
}
