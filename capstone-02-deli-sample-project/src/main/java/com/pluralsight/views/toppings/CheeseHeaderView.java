package com.pluralsight.views.toppings;

import com.pluralsight.views.ViewBase;
import com.pluralsight.views.enumerations.MeatOptions;

public class MeatHeaderView extends ViewBase<Void>
{
    @Override
    public void display()
    {
        printLine();
        printHeader("Select Premium Meat Toppings");


        printLine();
        printGreen("  [1] "); printLine(MeatOptions.STEAK);
        printGreen("  [2] "); printLine(MeatOptions.HAM);
        printGreen("  [3] "); printLine(MeatOptions.SALAMI);
        printGreen("  [4] "); printLine(MeatOptions.ROAST_BEEF);
        printGreen("  [5] "); printLine(MeatOptions.CHICKEN);
        printGreen("  [6] "); printLine(MeatOptions.BACON);
        printPurple("  [0] "); printLine(MeatOptions.DONE);

        printLine();
        print("Please select and option: ");
    }
}
