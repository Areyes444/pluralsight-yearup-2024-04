package com.pluralsight.collections;

import java.util.*;

public class CollectionsDemo
{
    public static void main(String[] args)
    {

        List<String> names = new LinkedList<>();
        Map<String, String> items = new HashMap<>();

        // use the .put() method to add a new item
        items.put("ABC123", "Ring Doorbell");

        // Queues are first in first out (FIFO)
        Queue<String> groceries = new LinkedList<>();
        groceries.offer("Milk");
        groceries.offer("Cereal");
        groceries.offer("Apples");

        System.out.println(groceries.size());
        System.out.println(groceries.poll());
        System.out.println(groceries.size());
    }
}