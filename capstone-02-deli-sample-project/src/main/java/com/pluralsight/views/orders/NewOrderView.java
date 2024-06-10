package com.pluralsight.views.orders;

import com.pluralsight.models.Order;
import com.pluralsight.views.ViewBase;

public class NewOrderView extends ViewBase
{
    public String display(Order order)
    {
        printLine();
        printHeader("New Order: " + order.getId());
        printYellow("Please enter your name: ");
        String name = getStringInput();
        return name;
    }
}
