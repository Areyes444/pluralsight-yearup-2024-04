package com.pluralsight;

// class is a template
public class Person
{
    private String firstName;
    private String lastName;
    private int age;

//    // constructors

    public Person()
    {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
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

}
