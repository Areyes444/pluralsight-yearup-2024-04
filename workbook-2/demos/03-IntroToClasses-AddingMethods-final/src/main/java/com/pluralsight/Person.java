package com.pluralsight;

// class is a template
public class Person
{
    // private variables
    private String firstName;
    private String lastName;
    private int age;
    private int energy;

    // constructors
    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.energy = 100;
    }

    public Person()
    {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.energy = 100;
    }

    // getters and setter
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

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public int getEnergy()
    {
        return energy;
    }

    // methods
    public void work(int hours)
    {
        int energyConsumed = hours * 10;
        energy -= energyConsumed;
        System.out.println(firstName + " worked " + hours + " hours and lost " + energyConsumed + " units of energy.");
    }

    public void work()
    {
        work(8);
    }

    public void eat()
    {
        energy += 20;
        System.out.println(firstName + " ate and gained 20 units of energy.");
    }

    public void sleep(int hours)
    {
        int energyGained = hours * 10;
        energy += energyGained;
        System.out.println(firstName + " slept for " + hours + " hours and gained " + energyGained + " units of energy.");
    }

}
