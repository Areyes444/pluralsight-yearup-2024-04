package com.pluralsight.services.data;

import com.pluralsight.models.data.ProductType;
import com.pluralsight.models.data.SizeType;
import com.pluralsight.services.Logger;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SizeTypeService
{
    private Logger logger;

    public SizeTypeService(Logger logger)
    {
        this.logger = logger;
    }

    public List<SizeType> getAll()
    {
        var types = new ArrayList<SizeType>();

        File file = new File("data/sizes.csv");

        try(Scanner reader = new Scanner(file))
        {
            // skip header
            reader.nextLine();
            while(reader.hasNextLine())
            {
                var line = reader.nextLine();
                var columns = line.split(",");

                int id = Integer.parseInt(columns[0]);
                int orderId = Integer.parseInt(columns[1]);
                String category = columns[2];
                String name = columns[3];
                BigDecimal price = new BigDecimal(columns[4]);
                BigDecimal extraPrice = new BigDecimal(columns[5]);

                var type = new SizeType(id, orderId, category, name, price, extraPrice);
                types.add(type);
            }
        }
        catch (IOException e)
        {
            logger.logMessage(e, this.getClass().getName());
        }

        return types;
    }

    public List<SizeType> getByCategory(String category)
    {
        var sizes = getAll();

        return sizes.stream().filter( s -> s.getCategory().equalsIgnoreCase(category)).toList();
    }

    public List<SizeType> getBread()
    {
        return getByCategory("Bread");
    }

    public List<SizeType> getMeat()
    {
        return getByCategory("Meat");
    }

    public List<SizeType> getCheese()
    {
        return getByCategory("Cheese");
    }

    public List<SizeType> getDrinks()
    {
        return getByCategory("Drink");
    }
}
