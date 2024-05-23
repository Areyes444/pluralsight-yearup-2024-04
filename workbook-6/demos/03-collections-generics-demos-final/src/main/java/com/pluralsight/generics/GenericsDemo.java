package com.pluralsight.generics;

import com.pluralsight.collections.Person;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo
{
    public static void main(String[] args)
    {
        // without generics
        IntegerPair pair = new IntegerPair(5, 7);
        System.out.println(pair.getLeftNumber() + " - " + pair.getRightNumber());
        pair.swap();
        System.out.println(pair.getLeftNumber() + " - " + pair.getRightNumber());

        // using the new Pair<T> generic class
        System.out.println();
        Pair<String> dynamicDuo = new Pair<>("Batman","Robin");
        System.out.println(dynamicDuo.getLeftThing() + " - " + dynamicDuo.getRightThing());
        dynamicDuo.swap();
        System.out.println(dynamicDuo.getLeftThing() + " - " + dynamicDuo.getRightThing());

        // Pair<Person>
        System.out.println();
        Pair<Person> people = new Pair<>(
                new Person("Zachary", "Westly", 31),
                new Person("Ezra", "Carter", 16)
        );
        System.out.println(people.getLeftThing() + " - " + people.getRightThing());
        people.swap();
        System.out.println(people.getLeftThing() + " - " + people.getRightThing());

        // Musical pair demo
        System.out.println();
        MusicalPair<Musician> duet = new MusicalPair<>(
                new Musician("Zachary", "Westly", 31),
                new Musician("Ezra", "Carter", 16)
        );

        // musical pair can perform
        duet.perform();

    }
}
