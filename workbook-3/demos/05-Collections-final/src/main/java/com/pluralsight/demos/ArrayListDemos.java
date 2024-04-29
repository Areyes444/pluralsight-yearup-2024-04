package com.pluralsight.demos;

import com.pluralsight.io.CityLoader;
import com.pluralsight.models.City;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;

public class ArrayListDemos
{
    public static void main(String[] args)
    {
        displayCustomerCountriesAsSet();
    }

    public static void basicArrayList()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        ArrayList<String> heroes = new ArrayList<String>();

        heroes.add("Thor");
        heroes.add("Spider-Man");
        heroes.add("Thor");
        heroes.add("Iron Man");
        heroes.add("Thor");
        heroes.add("Captain America");
        heroes.add("Thor");

        for (String hero : heroes)
        {
            System.out.println(hero);
        }

        System.out.println();
        while(heroes.contains("Thor"))
        {
            heroes.remove("Thor");
        }
        for (String hero : heroes)
        {
            System.out.println(hero);
        }

        System.out.println();

        for(int i = 0; i < heroes.size(); i++)
        {
            String hero = heroes.get(i);
            System.out.println(hero);
        }

//        heroes.add("Hulk");
//        heroes.add("Black Widow");
//        heroes.add("Hawkeye");
//        heroes.add("Ant-Man");
//        heroes.add("Wasp");
//        heroes.add("Black Panther");
//        heroes.add("Doctor Strange");
//        heroes.add("Scarlet Witch");
//        heroes.add("Vision");
//        heroes.add("Falcon");
//        heroes.add("Winter Soldier");
//        heroes.add("Star-Lord");
//        heroes.add("Gamora");
//        heroes.add("Drax the Destroyer");
//        heroes.add("Rocket Raccoon");
//        heroes.add("Groot");
    }

    public static void displayCities()
    {
        CityLoader cityLoader = new CityLoader();
        ArrayList<City> cities = cityLoader.loadCities();

        for (City city : cities)
        {
            System.out.println(city.getCountry());
        }
    }

    public static void displayCustomerCountries()
    {
        CityLoader cityLoader = new CityLoader();
        ArrayList<City> cities = cityLoader.loadCities();
        ArrayList<String> countries = new ArrayList<>();

        // build a list of unique countries
        for(City city: cities)
        {
           if(!countries.contains(city.getCountry()))
           {
               countries.add(city.getCountry());
           }
        }

        for(String country: countries)
        {
            System.out.println(country);
        }
    }

    public static void displayCustomerCountriesAsSet()
    {
        CityLoader cityLoader = new CityLoader();
        ArrayList<City> cities = cityLoader.loadCities();
        HashSet<String> countries = new HashSet<>();

        for(City city : cities)
        {
            countries.add(city.getCountry());
        }

        for (String country : countries)
        {
            System.out.println(country);
        }
    }

}
