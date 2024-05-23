package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamsDemo
{
    public static void main(String[] args)
    {
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Ian", "Carter", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Carter", 16) );
        myFamily.add( new Person("Elisha", "Anderson", 16) );

        List<Person> sortedList = myFamily.stream()
                                          .sorted()
                                          .toList();

        System.out.println("Original List is unchanged");
        System.out.println("-----------------------------");
        for(Person person : myFamily)
        {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("New List is sorted");
        System.out.println("-----------------------------");
        for(Person person : sortedList)
        {
            System.out.println(person);
        }

    }
}
