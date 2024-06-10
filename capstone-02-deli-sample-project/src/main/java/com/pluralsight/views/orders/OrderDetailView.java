package com.pluralsight.views.orders;

import com.pluralsight.models.Order;
import com.pluralsight.models.products.Sandwich;
import com.pluralsight.views.ViewBase;
import com.pluralsight.views.sandwich.SandwichSummaryView;

public class OrderDetailView extends ViewBase
{
    private SandwichSummaryView sandwichView = new SandwichSummaryView();

    public boolean printOrder(Order order)
    {
        printLine();
        printRedLine("-".repeat(HEADER_WIDTH));
        printRed("Order Detail: "); printLine(order.getId());
        printRedLine("-".repeat(HEADER_WIDTH));

        printYellow("Name:         "); printLine(order.getName());
        printYellow("Total Items:  "); printLine(order.getProducts().size());
        printRedLine("-".repeat(HEADER_WIDTH));

        order.getProducts().forEach(p -> {
            if(p instanceof Sandwich)
            {
                sandwichView.printSandwichSummary((Sandwich) p, false);
            }
            else
            {
                var className = p.getClass().getName().toLowerCase();
                var productName = className.substring(className.lastIndexOf(".") + 1);

                productName = productName.substring(0,1).toUpperCase() + productName.substring(1);

                printYellowLine(String.format("%-17s %-24s $ %5.2f", productName, p.getName(), p.getPrice()));
            }
            printRedLine("-".repeat(HEADER_WIDTH));
        });

        printGreenLine(String.format("%-41s $ %6.2f","Order Total:", order.getPrice()));
        printRedLine("-".repeat(HEADER_WIDTH));

        printLine();
        printOptionLine(1, "Complete");
        printCancelLine();

        while(true)
        {
            try
            {
                printYellow("Please select and option: ");
                int option = getIntInput();

                // cancel
                if(option == 1) return true;
                else if(option == 0) return false;
            }
            catch (Exception e)
            {
            }
            printRedLine("The option you selected is invalid.");
        }
    }
}
