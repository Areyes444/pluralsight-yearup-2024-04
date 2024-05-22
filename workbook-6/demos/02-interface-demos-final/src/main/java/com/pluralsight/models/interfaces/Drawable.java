package com.pluralsight.models.interfaces;

public interface Drawable
{
    void draw();

    default void print(String message)
    {
        System.out.println(message + " (from the Drawable interface)");
    }
}
