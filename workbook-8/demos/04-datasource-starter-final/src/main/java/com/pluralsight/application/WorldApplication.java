package com.pluralsight.application;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

public class WorldApplication
{
    DataSource dataSource;
    private String connectionString;
    private String username;
    private String password;

    public WorldApplication()
    {
        readProperties();
        // build a BasicDataSource
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(connectionString);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        // set our class dataSource to the BasicDataSource
        this.dataSource = dataSource;

    }

    private void readProperties()
    {
        Properties properties = new Properties();

        try(FileInputStream stream = new FileInputStream("src/main/resources/config.properties"))
        {
            properties.load(stream);
            connectionString = properties.getProperty("db.connectionstring");
            username = properties.getProperty("db.username");
            password = properties.getProperty("db.password");
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void run()
    {
        displayCities();
    }

    public void displayCities()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a State Name: ");
        String stateName = in.nextLine();
        System.out.print("Enter a min population: ");
        int populationSearch = Integer.parseInt(in.nextLine());


        // 1. open a connection to the database
        // use the database URL to point to the correct database
        try(Connection connection = dataSource.getConnection())
        {

            // 2. execute a statement
            String sql = """
                    SELECT Id
                        , Name
                        , CountryCode
                    FROM city
                    WHERE district = ?
                      AND population > ?
                  """;

            System.out.println();
            System.out.println(sql);
            System.out.println();

//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql);

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, stateName);
            preparedStatement.setInt(2, populationSearch);
            ResultSet resultSet = preparedStatement.executeQuery();

            // 2 a. - read the results
            while(resultSet.next())
            {
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("Name");
                String country = resultSet.getString("CountryCode");

                System.out.printf("%3d  %-30s %s\n", id, name, country);
            }


            // 3. close the connection
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
