package com.pluralsight;

public class Child extends Person
{
    public Child(int id, String name)
    {
        super(id, name);
    }

    @Override
    public String play()
    {
        return getName() + " is a child and is eating sand";
    }

    public String cry()
    {
        return getName() + " is a crying uncontrollably";
    }
}
