package com.pluralsight.services;

import com.pluralsight.models.LineItem;

import java.util.ArrayList;
import java.util.List;

public class LineItemBuilder
{
    public List<LineItem> createOrder()
    {
        List<LineItem> items = new ArrayList<>();
        items.add(new LineItem(201, "Apple", 0.99, 10));
        items.add(new LineItem(202, "Banana", 0.59, 12));
        items.add(new LineItem(203, "Bread", 2.49, 5));
        items.add(new LineItem(204, "Milk", 1.99, 3));
        items.add(new LineItem(205, "Eggs", 2.99, 2));
        items.add(new LineItem(206, "Cheese", 3.49, 4));
        items.add(new LineItem(207, "Chips", 1.49, 8));
        items.add(new LineItem(208, "Chocolate Bar", 0.99, 15));
        items.add(new LineItem(209, "Orange Juice", 3.99, 2));
        items.add(new LineItem(210, "Yogurt", 0.89, 6));

        return items;
    }
}
