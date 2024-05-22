package com.pluralsight;

import com.pluralsight.models.EtchASketch;
import com.pluralsight.models.Roomba;
import com.pluralsight.models.interfaces.Cleaner;
import com.pluralsight.models.interfaces.Movable;

import java.sql.Array;
import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
        Roomba roomba = new Roomba();
        EtchASketch etch = new EtchASketch();


        List<Cleaner> cleaners = new ArrayList<>();
        cleaners.add(etch);
        cleaners.add(roomba);

//        Collections.sort(cleaners); // this line won't work until I implement the Comparable interface

        for(Cleaner cleaner : cleaners)
        {
            clean(cleaner);
        }

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");

        Collections.sort(names);

        for (String name : names)
        {
            System.out.println(name);
        }

    }

    public static void clean(Cleaner cleaner)
    {
        cleaner.print("Print before clean.");
        cleaner.clean();
        System.out.println();
    }
}