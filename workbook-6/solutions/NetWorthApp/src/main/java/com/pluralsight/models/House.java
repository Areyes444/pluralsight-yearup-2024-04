package com.pluralsight.models;

public class House extends FixedAsset
{
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, int squareFeet, int bedrooms)
    {
        super(name, marketValue, "SqFt");
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public int getSquareFeet()
    {
        return squareFeet;
    }

    public int getBedrooms()
    {
        return bedrooms;
    }

    @Override
    public double getValue()
    {
        double baseValue = squareFeet * getMarketValue();

        return baseValue + (baseValue * bedrooms * .1);
    }
}
