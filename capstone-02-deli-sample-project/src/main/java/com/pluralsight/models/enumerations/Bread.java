package com.pluralsight.views.enumerations;

public enum BreadOptions
{
    WHITE("White"),
    WHEAT("Wheat"),
    RYE("Rye"),
    WRAP("Wrap");

    private final String val;

    BreadOptions(String val)
    {
        this.val = val;
    }

    @Override
    public String toString()
    {
        return val;
    }
}
