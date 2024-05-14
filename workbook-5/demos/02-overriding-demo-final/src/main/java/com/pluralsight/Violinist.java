package com.pluralsight;

public class Violinist extends Person
{
    public Violinist(int id, String name)
    {
        super(id, name);
    }

    public String tune()
    {
        return getName() + " is tuning their violin.";
    }

    @Override
    public String play()
    {
        return getName() + " is playing a concerto.";
    }
}
