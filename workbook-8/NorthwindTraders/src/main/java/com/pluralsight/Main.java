package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        display();


    }

    public static void display()
    {
        Scanner userInput= new Scanner(System.in);
        System.out.println("----------------North Wind Traders----------------");
        String input = "";
        int choice = 2;
        while(choice != 0)
        {
            try{
                System.out.println();
                System.out.println("What would you like to today? ");
                System.out.println("1) Display All Products ");
                System.out.println("2) Display All Customers ");
                System.out.println("0) Exit ");
                System.out.print("Select an Option: ");
                input = userInput.nextLine().strip().replace(" ", "");
                choice = Integer.parseInt(input);
                switch (choice)
                {
                    case 1:
                        displayAllProducts();
                        break;
                    case 2:
                        displayAllCustomers();
                        break;
                    case 0:
                        System.out.println();
                        System.out.println("GoodBye");
                        break;
                    default:
                        System.out.println();
                        System.out.println("Invalid Input");
                }

            }
            catch (InputMismatchException e)
            {
                userInput.nextLine();
                System.out.println();
                System.out.println("Invalid input");
            }
            catch (NumberFormatException e)
            {
                System.out.println();
                System.out.println("Invalid input please enter a number");
            }
            catch (Exception e)
            {
                System.out.println();
                System.out.println("Something went wrong, try again");
            }
        }

    }

    public static void displayAllProducts()
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
                 select productid
                   , productname
                   , unitprice
                   , unitsinstock                     
                    from products;
                    """;
            Statement statement = connection.createStatement();
            ResultSet row = statement.executeQuery(sql);
            //printing out the header for the table(columns)
            System.out.printf("%s %35s %15s %20s \n","Product Id", "Product Name", "Unit Price", "Units in Stock");
            System.out.println("-".repeat(100));
            // 2 a - read the results
            while(row.next())
            {
                int productid = row.getInt("productid");
                String productName = row.getString("productname");
                int unitprice = row.getInt("unitprice");
                int unitsinstock = row.getInt("unitsinstock");

                System.out.printf("%d %35s %15d %20d \n", productid, productName, unitprice, unitsinstock);
            }
            // 3. close the connection
            connection.close();

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public static void displayAllCustomers()
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
                    select ContactName
                                    , CompanyName
                                    , city
                                    , country
                                    , phone 
                            from customers;
                    """;
            Statement statement = connection.createStatement();
            ResultSet row = statement.executeQuery(sql);
            //printing out the header for the table(columns)
            System.out.printf("%-35s %-35s %-20s %-20s \n","Company Name", "City", "Country", "Phone");
            System.out.println("-".repeat(110));
            // 2 a - read the results
            while(row.next())
            {
                String CompanyName = row.getString("CompanyName");
                String city = row.getString("city");
                String country = row.getString("country");
                String phone = row.getString("phone");

                System.out.printf("%-35s %-35s %-20s %-20s \n", CompanyName, city, country, phone);
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
