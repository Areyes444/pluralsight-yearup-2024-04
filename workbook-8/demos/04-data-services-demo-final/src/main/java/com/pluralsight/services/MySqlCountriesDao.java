package com.pluralsight.services;

import com.pluralsight.models.Country;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlCountriesDao implements CountriesDao
{
    private DataSource dataSource;

    public MySqlCountriesDao(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    @Override
    public Country getCountryByCode(String countryCode)
    {
        try(Connection conn = dataSource.getConnection())
        {
            String sql = """
                        SELECT code
                             , name
                             , continent
                             , region
                             , surfacearea
                             , indepyear
                             , population
                             , lifeexpectancy
                             , gnp
                             , gnpold
                             , localname
                             , governmentform
                             , headofstate
                             , capital
                             , code2
                        FROM country
                        WHERE code = ?;
                    """;
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, countryCode);
            ResultSet row = statement.executeQuery();
            if(row.next())
            {
                String code = row.getString("code");
                String name = row.getString("name");
                String continent = row.getString("continent");
                String region = row.getString("region");
                Double surfacearea = row.getDouble("surfacearea");
                Integer indepyear = row.getInt("indepyear");
                Integer population = row.getInt("population");
                Double lifeexpectancy = row.getDouble("lifeexpectancy");
                Double gnp = row.getDouble("gnp");
                Double gnpold = row.getDouble("gnpold");
                String localname = row.getString("localname");
                String governmentform = row.getString("governmentform");
                String headofstate = row.getString("headofstate");
                Integer capital = row.getInt("capital");
                String code2 = row.getString("code2");

                Country country = new Country(code, name, continent, region, surfacearea, indepyear, population, lifeexpectancy, gnp, gnpold, localname, governmentform, headofstate, capital, code2);
                return country;
            }

        }
        catch (SQLException e)
        {
            // log error
        }

        return new Country();
    }

    @Override
    public List<Country> getCountriesByRegion(String region)
    {
        List<Country> countries = new ArrayList<>();

        try(Connection conn = dataSource.getConnection())
        {
            String sql = """
                        SELECT code
                             , name
                             , continent
                             , region
                             , surfacearea
                             , indepyear
                             , population
                             , lifeexpectancy
                             , gnp
                             , gnpold
                             , localname
                             , governmentform
                             , headofstate
                             , capital
                             , code2
                        FROM country
                        WHERE region = ?;
                    """;
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, region);
            ResultSet row = statement.executeQuery();
            while(row.next())
            {
                String code = row.getString("code");
                String name = row.getString("name");
                String continent = row.getString("continent");
                region = row.getString("region");
                Double surfacearea = row.getDouble("surfacearea");
                Integer indepyear = row.getInt("indepyear");
                Integer population = row.getInt("population");
                Double lifeexpectancy = row.getDouble("lifeexpectancy");
                Double gnp = row.getDouble("gnp");
                Double gnpold = row.getDouble("gnpold");
                String localname = row.getString("localname");
                String governmentform = row.getString("governmentform");
                String headofstate = row.getString("headofstate");
                Integer capital = row.getInt("capital");
                String code2 = row.getString("code2");

                Country country = new Country(code, name, continent, region, surfacearea, indepyear, population, lifeexpectancy, gnp, gnpold, localname, governmentform, headofstate, capital, code2);

                countries.add(country);
            }

        }
        catch (SQLException e)
        {
            // log error
        }

        return countries;
    }

    @Override
    public List<Country> getCountriesByContinent(String continent)
    {
        List<Country> countries = new ArrayList<>();

        try(Connection conn = dataSource.getConnection())
        {
            String sql = """
                        SELECT code
                             , name
                             , continent
                             , region
                             , surfacearea
                             , indepyear
                             , population
                             , lifeexpectancy
                             , gnp
                             , gnpold
                             , localname
                             , governmentform
                             , headofstate
                             , capital
                             , code2
                        FROM country
                        WHERE continent = ?;
                    """;
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, continent);
            ResultSet row = statement.executeQuery();
            while(row.next())
            {
                String code = row.getString("code");
                String name = row.getString("name");
                continent = row.getString("continent");
                String region = row.getString("region");
                Double surfacearea = row.getDouble("surfacearea");
                Integer indepyear = row.getInt("indepyear");
                Integer population = row.getInt("population");
                Double lifeexpectancy = row.getDouble("lifeexpectancy");
                Double gnp = row.getDouble("gnp");
                Double gnpold = row.getDouble("gnpold");
                String localname = row.getString("localname");
                String governmentform = row.getString("governmentform");
                String headofstate = row.getString("headofstate");
                Integer capital = row.getInt("capital");
                String code2 = row.getString("code2");

                Country country = new Country(code, name, continent, region, surfacearea, indepyear, population, lifeexpectancy, gnp, gnpold, localname, governmentform, headofstate, capital, code2);

                countries.add(country);
            }

        }
        catch (SQLException e)
        {
            // log error
        }

        return countries;
    }
}
