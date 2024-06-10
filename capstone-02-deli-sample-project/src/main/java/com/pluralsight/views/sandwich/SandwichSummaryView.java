package com.pluralsight.views.sandwich;

import com.pluralsight.models.products.Sandwich;
import com.pluralsight.models.toppings.Topping;
import com.pluralsight.views.ViewBase;

import java.util.List;

public class SandwichSummaryView extends ViewBase
{
    public void printSandwichSummary(Sandwich sandwich, boolean wait)
    {
        printBlueLine("Sandwich Summary");
        printRedLine("-".repeat(HEADER_WIDTH));
        printYellow("Name:           ");
        printLine(sandwich.getName());
        printYellow("Bread:          ");
        printLine(sandwich.getBread());
        printYellow("Toasted:        ");
        printLine(sandwich.isToasted() ? "Yes" : "No");

        printYellowLine("-".repeat(HEADER_WIDTH));

        printCyanLine(String.format(" - %-38s $ %6.2f", "Base Price", sandwich.getBasePrice()));

        printToppings("Meat", sandwich.getMeatToppings());
        printToppings("Cheese", sandwich.getCheeseToppings());
        printToppings("Regular", sandwich.getRegularToppings());
        printToppings("Sauces", sandwich.getSauces());
        printToppings("Sides", sandwich.getSides());

        printYellowLine("-".repeat(HEADER_WIDTH));
        printYellowLine(String.format("%-41s $ %6.2f", "Sandwich Total", sandwich.getPrice()));

        if(wait)
        {
            printLine();
            waitForUser();
        }

    }

    public void printToppings(String header, List<Topping> toppings)
    {
        if(toppings.isEmpty()) return;

        printSeparator(header);
        for(var topping: toppings)
        {
            printCyanLine(String.format(" - %-38s $ %6.2f", topping.getName(), topping.getPrice()));
        }
    }
}
