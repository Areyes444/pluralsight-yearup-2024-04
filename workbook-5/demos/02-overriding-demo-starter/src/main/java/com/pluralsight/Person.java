package com.pluralsight;

public class Person
{
    private int id;
    private String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String play()
    {
        return name + " is running:";
    }
}
