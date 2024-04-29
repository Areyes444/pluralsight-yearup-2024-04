package com.pluralsight.io;

import com.pluralsight.models.Product;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ProductLoader
{
    public ArrayList<Product> loadProducts()
    {
        ArrayList<Product> products = new ArrayList<>();

        File file = new File("files/inventory.csv");

        try(FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
        )
        {
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("[|]");

                int id = lineScanner.nextInt();
                String name = lineScanner.next();
                double price = lineScanner.nextDouble();
                String category = lineScanner.next();

                Product product = new Product(id, name, price, category);

                products.add(product);
            }

        }
        catch (IOException ex)
        {

        }

        return products;
    }

    public HashMap<Integer, Product> loadProductMap()
    {
        HashMap<Integer, Product> productMap = new HashMap<>();
        ArrayList<Product> products = loadProducts();

        for(Product product : products)
        {
            productMap.put(product.getId(), product);
        }

        return productMap;
    }
}
