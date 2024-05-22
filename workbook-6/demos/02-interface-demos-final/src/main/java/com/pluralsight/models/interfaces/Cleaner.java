package com.pluralsight.models.interfaces;

public interface Cleaner
{
    void clean();

    default void print(String message)
    {
        System.out.println(message + " (from Cleaner)");
    }
}
