package com.pluralsight.generics;

import com.pluralsight.collections.Person;

public class Musician extends Person
{
    public Musician(String firstName, String lastName, int age)
    {
        super(firstName, lastName, age);
    }

    public void perform()
    {
        System.out.println(getFirstName() + " is performing");
    }
}
