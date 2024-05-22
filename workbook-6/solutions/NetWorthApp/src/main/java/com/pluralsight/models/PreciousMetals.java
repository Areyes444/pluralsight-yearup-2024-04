package com.pluralsight.models;

public class PreciousMetals extends FixedAsset
{
    private double weight;

    public PreciousMetals(String name, double marketValue, double weight)
    {
        super(name, marketValue, "Ounces");
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    @Override
    public double getValue()
    {
        return weight * getMarketValue();
    }
}
