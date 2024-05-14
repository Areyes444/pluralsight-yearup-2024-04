package com.pluralsight;

import java.time.LocalDate;

public class Person
{
    private int id = 0;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    
    // constructor
    public Person(int id, String firstName, String lastName, LocalDate birthDate)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    // getters/ setters
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }

    // methods
    public void haveLunch()
    {
        System.out.printf("%s is having lunch. (in Person Class)\n", firstName);
    }
}

