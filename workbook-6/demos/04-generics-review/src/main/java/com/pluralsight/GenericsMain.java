package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain
{
    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<Person>();
        List<Integer> numbers = new ArrayList<>();
        Pair<String, String> coupon = new Pair<>("abc", "20% off any item");
        Pair<String, Double> coupon2 = new Pair<>("def", .20);
        ObjectPair coupon3 = new ObjectPair("def", ".20");

        double price = 15.00;
        System.out.println(price - price * coupon2.getValue());

    }
}
