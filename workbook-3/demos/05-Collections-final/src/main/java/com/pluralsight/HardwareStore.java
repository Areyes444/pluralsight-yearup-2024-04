package com.pluralsight;

import com.pluralsight.io.Logger;
import com.pluralsight.io.ProductLoader;
import com.pluralsight.models.LogEntry;
import com.pluralsight.models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HardwareStore
{
    private ProductLoader productLoader = new ProductLoader();
    private Scanner userInput = new Scanner(System.in);
    private Logger logger = new Logger("application-events");

    private ArrayList<Product> products;
    private HashMap<Integer, Product> productMap;

    public HardwareStore()
    {
        logger.logMessage("application","start application");
        products = productLoader.loadProducts();
        productMap = productLoader.loadProductMap();
    }

    public void run()
    {
        while(true)
        {
            int choice = displayHomeChoices();

            switch(choice)
            {
                case 1:
                    findProductById();
                    break;
                case 2:
                    searchByCategory();
                    break;
                case 3:
                    System.out.println("Goodbye");
                    logger.logMessage("application","exit application");
                    return;
                case 99: // hidden admin
                    displayLogs();
                    break;
            }
        }
    }

    private void displayLogs()
    {
        ArrayList<LogEntry> logEntries = logger.readLog();

        System.out.println();
        System.out.println("Log Entries");
        System.out.println("-".repeat(30));
        for (LogEntry entry : logEntries)
        {
            System.out.println(entry.getMessage());
        }
        System.out.println();
    }

    private void searchByCategory()
    {
        System.out.println();
        System.out.println("Search products by category");
        System.out.println("-".repeat(30));
        System.out.print("Enter category name: ");
        String category = userInput.nextLine().strip();


//        // original loop
//        for(Product product : products)
//        {
//            if(product.getCategory().equalsIgnoreCase(category))
//            {
//                System.out.printf("%d %-30s $ %.2f \n", product.getId(), product.getName(), product.getPrice());
//            }
//        }

        // create a new list of only those products in the category
        List<Product> filteredProducts = products.stream()
                                                 .filter(product -> product.getCategory().equalsIgnoreCase(category))
                                                 .toList();

        logger.logMessage("search","search by category: " + category + " (" + filteredProducts.size() + " products found)");

        for(Product product : filteredProducts)
        {
            System.out.printf("%d %-30s $ %.2f \n", product.getId(), product.getName(), product.getPrice());
        }

        System.out.println();

    }

    private void findProductById()
    {
        System.out.println();
        System.out.println("Find Product by ID");
        System.out.println("-".repeat(30));
        System.out.print("Enter product id: ");
        int productId = Integer.parseInt(userInput.nextLine().strip());


        // products
        Product product = productMap.get(productId);

//        // looping through ALL products is not very efficient
//        for(Product currentProduct : products)
//        {
//            if(currentProduct.getId() == productId)
//            {
//                product = currentProduct;
//                break;
//            }
//        }

        System.out.println();
        if(product != null)
        {
            logger.logMessage("search","search by id: " + productId + " (found)");
            System.out.println("Id:       " + product.getId());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Name:     " + product.getName());
            System.out.println("Price:    $ " + product.getPrice());
        }
        else {
            logger.logMessage("search","search by id: " + productId + " (not found)");
            System.out.println("Product " + productId + " was not found.");
        }
        System.out.println();
    }

    public int displayHomeChoices()
    {
        while (true)
        {
            try
            {
                System.out.println();
                System.out.println("Gregor's Hardware Store");
                System.out.println("-".repeat(30));
                System.out.println("1) Find product by ID");
                System.out.println("2) Search by category");
                System.out.println("3) Exit");
                System.out.println();
                System.out.print("Please select an option: ");
                return Integer.parseInt(userInput.nextLine().strip());
            }
            catch(Exception ex)
            {
                logger.logMessage("Error", "Home Screen selection: " +ex.toString());
            }
        }
    }
}
