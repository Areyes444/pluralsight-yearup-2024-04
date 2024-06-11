package com.pluralsight;

import java.sql.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a State Name: ");
        String stateName = "'" + in.nextLine() + "'";

        String username = "root";
        String password = "P@ssw0rd";

        try
        {
            // load the MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1. open a connection to the database
            // use the database URL to point to the correct database
            Connection connection;
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world",
                    username,
                    password);

            // 2. execute a statement
            String sql = """
                    SELECT Id
                        , Name
                        , CountryCode
                    FROM city
                    WHERE district = """ + stateName + """
                  """;

            System.out.println(sql);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // 2 a. - read the results
            while(resultSet.next())
            {
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("Name");
                String country = resultSet.getString("CountryCode");

                System.out.printf("%3d  %-30s %s\n", id, name, country);
            }


            // 3. close the connection
            connection.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}