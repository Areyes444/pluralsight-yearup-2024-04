package com.pluralsight;

public class Gamer extends Person
{
    public Gamer(int id, String name)
    {
        super(id, name);
    }

    public String rageQuit()
    {
        return "I'M OUT!!!";
    }

    @Override
    public String play()
    {
        return getName() + " is killing it at Tekken";
    }
}
