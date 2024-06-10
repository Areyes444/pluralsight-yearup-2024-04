package com.pluralsight.services.data;

import com.pluralsight.models.data.ProductType;
import com.pluralsight.services.Logger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvProductTypesService implements ProductTypesService
{
    private Logger logger;

    public CsvProductTypesService(Logger logger)
    {
        this.logger = logger;
    }

    public List<ProductType> getAll()
    {
        var types = new ArrayList<ProductType>();

        File file = new File("data/products.csv");

        try (Scanner reader = new Scanner(file))
        {
            // skip header
            reader.nextLine();
            while (reader.hasNextLine())
            {
                var line = reader.nextLine();
                var columns = line.split(",");

                int id = Integer.parseInt(columns[0]);
                int orderId = Integer.parseInt(columns[1]);
                String category = columns[2];
                String name = columns[3];

                var type = new ProductType(id, orderId, category, name);
                types.add(type);
            }
        }
        catch (IOException e)
        {
            logger.logMessage(e, this.getClass().getName());
        }

        return types;
    }

    public List<ProductType> getByCategory(String category)
    {
        var products = getAll();

        return products.stream().filter(p -> p.getCategory().equalsIgnoreCase(category)).toList();
    }

    public List<ProductType> getBread()
    {
        return getByCategory("Bread");
    }

    public List<ProductType> getMeat()
    {
        return getByCategory("Meat");
    }

    public List<ProductType> getCheese()
    {
        return getByCategory("Cheese");
    }

    public List<ProductType> getRegularToppings()
    {
        return getByCategory("Regular");
    }

    public List<ProductType> getSauces()
    {
        return getByCategory("Sauce");
    }

    public List<ProductType> getSides()
    {
        return getByCategory("Side");
    }

    public List<ProductType> getDrinks()
    {
        return getByCategory("Drink");
    }

    public List<ProductType> getChips()
    {
        return getByCategory("Chips");
    }

    public List<ProductType> getSignature()
    {
        return getByCategory("Signature");
    }
}
