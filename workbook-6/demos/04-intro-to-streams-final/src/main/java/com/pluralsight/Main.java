package com.pluralsight;

import com.pluralsight.models.LineItem;
import com.pluralsight.models.PickItem;
import com.pluralsight.services.LineItemBuilder;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
//        forEachDemo();
//        filterDemo();
//        sortDemo();
//        mapDemo1();
//        mapDemo2();
//        reduceDemo();
        calculateTotalOrderAmount();
    }

    public static void calculateTotalOrderAmount()
    {
        List<LineItem> lineItems = LineItemBuilder.createOrder();

        var totalOrderAmount = lineItems.stream()
                                        .filter(lineItem -> lineItem.getPrice() < 1.00)
                                        .map(lineItem -> lineItem.getLineTotal())
                                        .reduce(0.0, (sum, price) -> sum + price);

        System.out.println(totalOrderAmount);

    }



    public static void forEachDemo()
    {
        List<LineItem> lineItems = LineItemBuilder.createOrder();

        lineItems.forEach(lineItem -> {
            System.out.println(lineItem.toString());
        });

        for(LineItem lineItem : lineItems)
        {
            System.out.println(lineItem.toString());
        }
    }

    public static void filterDemo()
    {
        List<LineItem> lineItems = LineItemBuilder.createOrder();
//        List<LineItem> cheapStuff = new ArrayList<>();
//
//        lineItems.forEach(lineItem -> {
//            if(lineItem.getPrice() < 1.00)
//            {
//                cheapStuff.add(lineItem);
//            }
//        });

        List<LineItem> cheapStuff = lineItems.stream()
                                             .filter(lineItem -> lineItem.getPrice() < 1.00)
                                             .filter(lineItem -> !lineItem.getProductName().contains("Chocolate"))
                                             .toList();

        cheapStuff.forEach(lineItem -> {
            System.out.println(lineItem);
        });

    }

    public static void sortDemo()
    {
        List<LineItem> lineItems = LineItemBuilder.createOrder();
//        List<LineItem> sortedLineItems = new ArrayList<>(lineItems);
//        Collections.sort(sortedLineItems);

        List<LineItem> sortedLineItems = lineItems.stream()
                                                  .sorted((item1, item2) -> (int)((item2.getPrice() - item1.getPrice()) * 100))
                                                  .toList();

        sortedLineItems.forEach(lineItem -> {
            System.out.println(lineItem);
        });
    }

    public static void mapDemo1()
    {
        List<LineItem> lineItems = LineItemBuilder.createOrder();

        List<Double> prices = lineItems.stream()
                                       .map(lineItem -> lineItem.getPrice() * 2)
                                       .toList();

        prices.forEach(price -> {
            System.out.println(price);
        });
    }

    public static void mapDemo2()
    {
        List<LineItem> lineItems = LineItemBuilder.createOrder();

        var pickList = lineItems.stream()
                                .map(lineItem -> new PickItem(lineItem.getProductId(), lineItem.getQuantity()))
                                .toList();

        pickList.forEach(item -> {
            System.out.println(item);
        });
    }

    public static void reduceDemo()
    {
        Integer[] array = {13, 41, 12};
        List<Integer> numbers = Arrays.asList(array );

//        int sum = 0;
//
//        for(Integer number : numbers)
//        {
//            sum += number;
//        }

        int answer = numbers.stream()
                            .reduce(0,(sum, number) -> sum + number);

        int minValue = numbers.stream().reduce(
                                numbers.getFirst(),
                                (lowest, number) -> {
                                                        if(number < lowest)
                                                            return number;
                                                        else
                                                            return lowest;
                                                    }
                        );

        System.out.println(answer);
    }

}