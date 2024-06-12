package com.pluralsight.application;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

public class NorthWindApplication
{
   private Scanner userInput= new Scanner(System.in);
    //initiating variable
    DataSource datasource;


    public NorthWindApplication()
    {
        readProperties();

    }

    private void readProperties()
    {
        //building the BasicDataSource
        //first get the variables from the properties file
        Properties properties = new Properties();

        try(FileInputStream stream = new FileInputStream("src/main/resources/config.properties"))
        {
            properties.load(stream);
            String connectionString = properties.getProperty("db.connectionString");
            String username = properties.getProperty("db.username");
            String  password = properties.getProperty("db.password");

            //build a BasicDataSource object
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl(connectionString);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            //setting class dataSource to the BasicDataSource
            this.datasource = dataSource;

        } catch (IOException e)
        {

            throw new RuntimeException(e);
        }
    }

    public void run()
    {

        System.out.println("----------------North Wind Traders----------------");
        String input = "";
        int choice = 3;
        while(choice != 0)
        {
            try{
                System.out.println();
                System.out.println("What would you like to today? ");
                System.out.println("1) Display All Products ");
                System.out.println("2) Display All Customers ");
                System.out.println("3) Display All Categories ");
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
                    case 3:
                        displayAllCategories();
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

    public void displayAllProducts()
    {


        try
        {
            // load the MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1. open a connection to the database
            // use the database URL to point to the correct database
            Connection connection;
            connection = datasource.getConnection();

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

    public void displayAllCustomers()
    {

        try
        {
            // load the MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1. open a connection to the database
            // use the database URL to point to the correct database
            Connection connection;
            connection = datasource.getConnection();


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

    public void displayAllCategories()
    {

        try
        {
            // load the MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1. open a connection to the database
            // use the database URL to point to the correct database
            Connection connection;
            connection = datasource.getConnection();


            // 2. execute a statement

            String sql = """
                    select CategoryId
                    , CategoryName
                    from categories
                    order by CategoryId;
                    """;
            Statement statement = connection.createStatement();
            ResultSet row = statement.executeQuery(sql);
            //printing out the header for the table(columns)
            System.out.printf("%-12s %-25s \n","Category Id", "Category Name");
            System.out.println("-".repeat(50));
            // 2 a - read the results
            while(row.next())
            {
                int categoryId = row.getInt("CategoryId");
                String CategoryName = row.getString("CategoryName");

                System.out.printf("%-12d %-25s \n", categoryId, CategoryName);
            }
            //right after displaying all the categories
            System.out.print("Enter the Category Id so you can see the products: ");
            int categoryId = Integer.parseInt(userInput.nextLine());

            //calling the method that displays that specific category display based on what the userinput is
            displayingCategoryProducts(categoryId, connection);
            // 3. close the connection
            connection.close();

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public static void displayingCategoryProducts(int categoryId, Connection connection)
    {
        try
        {
            //writing down the sql statement
            String sql = """
                    select ProductName
                    , UnitPrice
                    , UnitsInStock
                    from products 
                    Where CategoryId = ?
                    """;


            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, categoryId);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.printf("%-30s %15s %25s\n", "Product Name", "Unit Price", "Units In Stock");
            System.out.println("-".repeat(80));

            while(resultSet.next())
            {
                String productName = resultSet.getString("ProductName");
                double UnitPrice = resultSet.getDouble("UnitPrice");
                int UnitsInStock = resultSet.getInt("UnitsInStock");

                System.out.printf("%-35s $%8.2f %25d\n", productName, UnitPrice, UnitsInStock );
            }
            //close the connection
            connection.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}

