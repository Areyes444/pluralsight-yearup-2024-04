package com.pluralsight.services.receipts;

import com.pluralsight.models.Order;
import com.pluralsight.models.products.Sandwich;
import com.pluralsight.models.toppings.Topping;
import com.pluralsight.services.Logger;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReceiptService
{
    private static final int HEADER_WIDTH = 50;
    private Logger logger;

    private static final String PATH = "receipts/";

    public ReceiptService(Logger logger)
    {
        this.logger = logger;
    }

    public int getNextOrderNumber()
    {
        int fileCount = 0;
        File path = new File(PATH);

        if (path.exists() && path.isDirectory())
        {
            fileCount = path.list().length;
        }

        return 1000 + fileCount + 1;
    }

    public void createRecipt(Order order)
    {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        var dateFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        var timeFormatter = DateTimeFormatter.ofPattern("HHmmss");

        var path = date.format(dateFormatter) + "-" + time.format(timeFormatter) + "-" + order.getId() + ".txt";
        var file = new File(PATH + path);

        try(PrintWriter out = new PrintWriter(file))
        {

            out.println();
            out.println("-".repeat(HEADER_WIDTH));
            out.println("Order Detail: " + order.getId());
            out.println("-".repeat(HEADER_WIDTH));

            out.println("Name:         " + order.getName());
            out.println("Total Items:  " + order.getProducts().size());
            out.println("-".repeat(HEADER_WIDTH));

            order.getProducts().forEach(p -> {
                if(p instanceof Sandwich)
                {
                    printSandwichSummary(out, (Sandwich) p);
                }
                else
                {
                    var className = p.getClass().getName().toLowerCase();
                    var productName = className.substring(className.lastIndexOf(".") + 1);

                    productName = productName.substring(0,1).toUpperCase() + productName.substring(1);

                    out.println(String.format("%-17s %-23s $ %6.2f", productName, p.getName(), p.getPrice()));
                }
                out.println("-".repeat(HEADER_WIDTH));
            });

            out.println(String.format("%-41s $ %6.2f","Order Total:", order.getPrice()));
            out.println("-".repeat(HEADER_WIDTH));
        }
        catch (IOException e)
        {
            logger.logMessage(e, this.getClass().getName());
        }
    }


    public void printSandwichSummary(PrintWriter out, Sandwich sandwich)
    {
        out.println("Sandwich Summary");
        out.println("-".repeat(HEADER_WIDTH));
        out.println("Name:           " + sandwich.getName());
        out.println("Bread:          " + sandwich.getBread());
        out.println("Toasted:        " + (sandwich.isToasted() ? "Yes" : "No"));

        out.println("-".repeat(HEADER_WIDTH));

        out.println(String.format(" - %-38s $ %6.2f", "Base Price", sandwich.getBasePrice()));

        printToppings(out,"Meat", sandwich.getMeatToppings());
        printToppings(out,"Cheese", sandwich.getCheeseToppings());
        printToppings(out,"Regular", sandwich.getRegularToppings());
        printToppings(out,"Sauces", sandwich.getSauces());
        printToppings(out,"Sides", sandwich.getSides());

        out.println("-".repeat(HEADER_WIDTH));
        out.println(String.format("%-41s $ %6.2f", "Sandwich Total", sandwich.getPrice()));
        out.println("-".repeat(HEADER_WIDTH));

        out.println();
    }

    public void printToppings(PrintWriter out, String header, List<Topping> toppings)
    {
        if(toppings.isEmpty()) return;

        printSeparator(out, header);
        for(var topping: toppings)
        {
            out.println(String.format(" - %-38s $ %6.2f", topping.getName(), topping.getPrice()));
        }
    }

    public void printSeparator(PrintWriter out, String message)
    {
        int remainingSpace = HEADER_WIDTH - message.length() - 2;
        int front = (remainingSpace / 2);
        int back = remainingSpace - front;

        out.print("-".repeat(front));
        out.print(" " + message + " ");
        out.println("-".repeat(back));

    }

}
