package com.pluralsight.demos;

import com.pluralsight.io.CityLoader;
import com.pluralsight.models.City;

import java.util.*;

public class HashMapDemos
{
    public static void main(String[] args)
    {
        displayCitiesPerCountry();
    }

    public static void simpleMaps()
    {
        HashMap<String, Integer> supplies = new HashMap<String, Integer>();

        supplies.put("Markers", 26);
        supplies.put("Scissors", 10);
        supplies.put("Crayons", 10);

//        supplies.put("Markers", 12);

        System.out.println(supplies.getOrDefault("Scissors",0));
        System.out.println(supplies.getOrDefault("Crayons",0));

        for(String key : supplies.keySet())
        {
            int value = supplies.get(key);
            System.out.println(key + ": " + value);
        }

        for(Map.Entry<String, Integer> row : supplies.entrySet())
        {
            System.out.println(row.getKey() + ": " + row.getValue());
        }
    }

    public static void displayCitiesPerCountry()
    {
        CityLoader loader = new CityLoader();
        ArrayList< City> cities = loader.loadCities();
        HashMap<String, Integer> countries = new HashMap<>();

        // populate the hashMap
        for(City city: cities)
        {
            String key = city.getCountry();
            if(countries.containsKey(key))
            {
                //
                int count = countries.get(key) + 1;
                countries.put(key, count);
            }
            else
            {
                // the country does not exist yet
                countries.put(key, 1);
            }
        }

        for(Map.Entry<String, Integer> entry: countries.entrySet())
        {
            System.out.println(entry.getKey() + "  " + entry.getValue() );
        }
    }
}
