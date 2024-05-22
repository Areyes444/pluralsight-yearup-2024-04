package com.pluralsight.models;

import com.pluralsight.models.interfaces.Valuable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Portfolio implements Valuable
{
    private String name;
    private String owner;
    private List<Valuable> valuables;

    public Portfolio(String name, String owner)
    {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public void add(Valuable valuable)
    {
        valuables.add(valuable);
    }

    @Override
    public double getValue()
    {
        double netWorth = 0.0;

        for (Valuable valuable : valuables)
        {
            netWorth += valuable.getValue();
        }

        return netWorth;
    }
}
