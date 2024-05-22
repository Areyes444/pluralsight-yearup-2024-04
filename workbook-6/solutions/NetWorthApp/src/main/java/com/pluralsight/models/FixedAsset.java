package com.pluralsight.models;

import com.pluralsight.models.interfaces.Valuable;

public abstract class FixedAsset implements Valuable
{
    private String name;
    private double marketValue;
    private String units;

    public FixedAsset(String name, double marketValue, String units)
    {
        this.name = name;
        this.marketValue = marketValue;
        this.units = units;
    }

    public String getName()
    {
        return name;
    }

    public double getMarketValue()
    {
        return marketValue;
    }

    public void setMarketValue(double marketValue)
    {
        this.marketValue = marketValue;
    }

    public String getUnits()
    {
        return units;
    }
}
