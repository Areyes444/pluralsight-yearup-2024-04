package com.pluralsight;

import java.sql.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a State Name: ");
        String stateName = in.nextLine();
        System.out.print("Enter a min population: ");
        int populationSearch = Integer.parseInt(in.nextLine());


        String connectionString = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "P@ssw0rd";

        // load the MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 1. open a connection to the database
        // use the database URL to point to the correct database
        try(Connection connection = DriverManager.getConnection(connectionString, username, password))
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