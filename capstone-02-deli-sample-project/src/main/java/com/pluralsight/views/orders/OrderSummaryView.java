package com.pluralsight.views.orders;

import com.pluralsight.models.Order;
import com.pluralsight.views.ViewBase;

public class OrderSummaryView extends ViewBase
{
    public void displaySummary(Order order)
    {
        printLine();
        printRedLine("-".repeat(HEADER_WIDTH));
        printRedLine("Order Summary");
        printRedLine("-".repeat(HEADER_WIDTH));
        printYellow("Order Number: "); printLine(order.getId());
        printYellow("Name:         "); printLine(order.getName());
        printYellow("Items:        "); printLine(order.getProducts().size());
        printGreen ("Total:      $ "); printLine(order.getPrice());
        printRedLine("-".repeat(HEADER_WIDTH));
    }
}
