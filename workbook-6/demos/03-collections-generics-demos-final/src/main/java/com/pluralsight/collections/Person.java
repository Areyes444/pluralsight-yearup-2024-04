package com.pluralsight.collections;

public class Person implements Comparable<Person>
{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int compareTo(Person other)
    {
        // sort by age first
        if(this.age != other.age)
        {
            return other.age - this.age;
        }
        else if(!this.lastName.equalsIgnoreCase(other.lastName))
        {
            return this.lastName.compareTo(other.lastName);
        }
        else
        {
            return this.firstName.compareTo(other.firstName);
        }

    }

    @Override
    public String toString()
    {
        return String.format("%s %s (%d)", firstName, lastName, age);
    }
}
