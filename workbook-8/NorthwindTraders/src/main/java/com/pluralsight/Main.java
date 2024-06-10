package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main
{
    public static void main(String[] args)
    {
        String username = "root";
        String password = "YUm15510n";

        try
        {
            // load the MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1. open a connection to the database
            // use the database URL to point to the correct database
            Connection connection;
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password);

            // 2. execute a statement

            String sql = """
                    select productname
                     from products;
                    """;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            // 2 a. - read the results
            while(resultSet.next())
            {
                String productName = resultSet.getString("productName");
                System.out.println(productName);
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