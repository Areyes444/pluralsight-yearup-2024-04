package com.pluralsight;

public class SoftballPlayer extends Person
{
    public SoftballPlayer(int id, String name)
    {
        super(id, name);
    }

    public String warmup()
    {
        return getName() + " is playing catch to warm up her arm.";
    }

    @Override
    public String play()
    {
        return getName() + " is up to bat.";
    }
}
