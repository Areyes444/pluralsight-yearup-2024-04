package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Object[] items = new Object[5];
        items[0] = "Today";
        items[1] = 5;
        items[2] = new Person("John Doe", 25);
        items[3] = "great";
        items[4] = "day";

        for(Object item: items)
        {
            if(item instanceof Person)
            {
                Person person = (Person)item;
                System.out.println(person.getName());
            }
            else {
                System.out.println(item);
            }
        }

        Person[] people = new Person[1];
        people[0] = new Person("John Doe", 25);

        for(Person person: people)
        {
            System.out.println(person.getName());
        }


    }
}