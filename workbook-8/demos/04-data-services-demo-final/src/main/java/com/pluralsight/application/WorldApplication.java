package com.pluralsight.application;

import com.pluralsight.models.City;
import com.pluralsight.models.Country;
import com.pluralsight.services.CitiesDao;
import com.pluralsight.services.CountriesDao;
import com.pluralsight.services.MySqlCitiesDao;
import com.pluralsight.services.MySqlCountriesDao;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class WorldApplication
{
    Scanner in = new Scanner(System.in);

    DataSource dataSource;
    CitiesDao citiesDao;
    CountriesDao countriesDao;

    public WorldApplication()
    {
        this.dataSource = buildDataSource();
        citiesDao = new MySqlCitiesDao(this.dataSource);
        countriesDao = new MySqlCountriesDao(this.dataSource);
    }

    private DataSource buildDataSource()
    {
        try (FileInputStream stream = new FileInputStream("src/main/resources/config.properties"))
        {
            // first get the variables from the properties file
            Properties properties = new Properties();
            properties.load(stream);

            String connectionString = properties.getProperty("db.connectionString");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            // build a BasicDataSource object
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl(connectionString);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            return dataSource;

        }
        catch (IOException e)
        {
        }

        return null;
    }

    public void run()
    {
        while(true)
        {
            int selection = getUserChoice();

            switch(selection)
            {
                case 1 -> findCityById();
                case 2 -> searchCitiesByState();
                case 3 -> searchCitiesByCountry();
                case 4 -> findCountryByCountryCode();
                case 5 -> searchCountriesByRegion();
                case 6 -> searchCountriesByContinent();
                default -> System.exit(0);
            }
        }
    }

    private int getUserChoice()
    {
        System.out.println();
        System.out.println("Here are your options");
        System.out.println("-".repeat(50));
        System.out.println("1. Get city by ID");
        System.out.println("2. Show cities by state");
        System.out.println("3. Show cities by country");
        System.out.println("4. Get Country by country code");
        System.out.println("5. Show Countries by region");
        System.out.println("6. Show Countries by continent");
        System.out.println("0. Exit");

        System.out.println();
        System.out.print("Enter your choice: ");
        return Integer.parseInt(in.nextLine().strip());
    }

    private void findCityById()
    {
        System.out.print("Enter a city id: ");
        int cityId = Integer.parseInt(in.nextLine());

        City city = citiesDao.getCityById(cityId);
        displayCity(city);
    }

    private void searchCitiesByCountry()
    {
        System.out.print("Enter a country: ");
        String country = in.nextLine();

        List<City> cities = citiesDao.getCitiesByCountry(country);

        System.out.println();
        cities.forEach(city -> displayCity(city));
    }

    private void searchCitiesByState()
    {
        System.out.print("Enter a state name: ");
        String state = in.nextLine();

        List<City> cities = citiesDao.getCitiesByState(state);

        System.out.println();
        cities.forEach(city -> displayCity(city));
    }


    private void findCountryByCountryCode()
    {
        System.out.print("Enter a country code: ");
        String countryCode = in.nextLine();

        Country country = countriesDao.getCountryByCode(countryCode);

        System.out.println();
        displayCountry(country);
    }

    private void searchCountriesByRegion()
    {
        System.out.print("Enter a world region: ");
        String region = in.nextLine();

        List<Country> countries = countriesDao.getCountriesByRegion(region);

        System.out.println();
        countries.forEach(country -> displayCountry(country));
    }

    private void searchCountriesByContinent()
    {
        System.out.print("Enter a continent name: ");
        String continent = in.nextLine();

        List<Country> countries = countriesDao.getCountriesByContinent(continent);

        System.out.println();
        countries.forEach(country -> displayCountry(country));
    }

    private void displayCity(City city)
    {
        System.out.printf("%3d  %-30s %s\n", city.getId(), city.getName(), city.getCountry());
    }

    private void displayCountry(Country country)
    {
        System.out.printf("%3s  %-30s %s\n", country.getCode(), country.getName(), country.getContinent());
    }
}
