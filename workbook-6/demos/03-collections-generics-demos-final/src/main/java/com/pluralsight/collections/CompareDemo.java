package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareDemo
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


//        Collections.sort(myFamily);

        for(Person person : myFamily)
        {
            System.out.println(person);
        }

    }
}
