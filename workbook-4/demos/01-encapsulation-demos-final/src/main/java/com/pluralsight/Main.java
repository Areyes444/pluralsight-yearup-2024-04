package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person("John", "Doe", 25);
        System.out.println(person.getFirstName() + " " + person.getLastName());

        // prompt user for order details
        Order donuts = new Order("Gregor", "Glazed", 4.50, 6);
        System.out.println(donuts.getTotalPrice());

    }
}