package com.pluralsight.views.toppings;

import com.pluralsight.models.toppings.Topping;
import com.pluralsight.views.ViewBase;

import java.util.List;

public class ToppingListDisplayView extends ViewBase
{
    public void printToppings(List<Topping> toppings)
    {
        for(var topping : toppings)
        {
            if(!topping.isExtra())
            {
                printCyanLine(String.format(" - %-15s $ %.2f", topping.getName(), topping.getPrice()));
            }
            else
            {
                var className = topping.getClass().getName().toLowerCase();
                var toppingName = className.substring(className.lastIndexOf(".") + 1);
                printCyanLine(String.format(" - %-15s $ %.2f (extra %s)", topping.getName(), topping.getPrice(), toppingName));
            }
        }
    }
}
