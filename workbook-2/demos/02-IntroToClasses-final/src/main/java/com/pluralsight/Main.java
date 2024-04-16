package com.pluralsight;

import com.pluralsight.models.*;

public class Main
{
    public static void main(String[] args)
    {
        // declare variables
        Person person1 = new Person("Ava", "Martinez", 23); // this executes the constructor

        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());

        Person person2 = new Person();
        person2.setFirstName("Ava");
        person2.setLastName("Martinez");
        person2.setAge(23);




    }
}