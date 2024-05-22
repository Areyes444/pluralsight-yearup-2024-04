package com.pluralsight.models;

import com.pluralsight.models.interfaces.Cleaner;
import com.pluralsight.models.interfaces.Drawable;

public class EtchASketch implements Drawable, Cleaner
{

    @Override
    public void clean()
    {
        System.out.println("Cleaning the canvas of the Etch A Sketch");
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing on the EtchASketch canvas");
    }

    @Override
    public void print(String message)
    {
        Drawable.super.print(message);
        Cleaner.super.print(message);
    }
}
