package com.pluralsight.io;

import com.pluralsight.models.City;
import com.pluralsight.models.Product;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CityLoader
{
    public ArrayList<City> loadCities()
    {
        ArrayList<City> cities = new ArrayList<>();

        File file = new File("files/cities.csv");

        try(FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
        )
        {
            // skip header
            scanner.nextLine();

            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("[|]");

                String name = lineScanner.next();
                String stateCode = lineScanner.next();
                String state = lineScanner.next();
                String country = lineScanner.next();

                City city = new City(name, stateCode, state, country);

                cities.add(city);
            }

        }
        catch (IOException ex)
        {

        }

        return cities;
    }
}
