package com.pluralsight;

public class Main
{

    public static void main(String[] args)
    {
        // variable naming
        // must start with a letter or _
        // cannot have spaces in the name
        // camelCasing
        // PascalCasing
        // snake_case -- not really used in java
        // UPPER_CASE -- in Java this is for constants
        // kebab-case -- does not work in Java (but used in other languages)

        // numbers

        // declare a variable that has the count of kids on a bus
        byte countOfKidsOnBus;
        countOfKidsOnBus = 127;
        System.out.println("Kids on bus: " + countOfKidsOnBus);

        // declare a variable that has a count of the number of buses in the school district
        int countOfBusesInDistrict = 12;
        System.out.println("Buses in the school district: " + countOfBusesInDistrict);

        // price of chocolate
        double priceOfChocolate = 1.5;
        System.out.println("Price of a chocolate bar: " + priceOfChocolate);

        // are all of the kids on the bus?
        boolean kidsAreOnBus = true;
        System.out.println("All of the kids are on the bus: " + kidsAreOnBus);

        // the first letter of the alphabet
        char firstLetter = 'a';
        System.out.println("First letter of the alphabet: " + firstLetter);

        // name of your favorite restaurant
        // string is not a primitive
        String favoriteRestaurant = "Texas Roadhouse";
        System.out.println("Favorite restaurant: " + favoriteRestaurant);


    }
}