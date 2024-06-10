package com.pluralsight.models.enumerations;

public enum Bread
{
    WHITE("White"),
    WHEAT("Wheat"),
    RYE("Rye"),
    WRAP("Wrap");

    private final String val;

    Bread(String val)
    {
        this.val = val;
    }

    @Override
    public String toString()
    {
        return val;
    }
}
