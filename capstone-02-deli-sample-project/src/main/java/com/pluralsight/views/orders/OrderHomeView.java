package com.pluralsight.views.orders;

import com.pluralsight.views.ViewBase;
import com.pluralsight.controllers.enumerations.OrderOptions;

public class OrderHomeView extends ViewBase
{
    public OrderOptions getOrderOptionSelection()
    {

        printLine();
        printHeader("Order");

        printLine();
        printGreen("  [1] "); printLine(OrderOptions.SANDWICH);
        printGreen("  [2] "); printLine(OrderOptions.SIGNATURE);
        printGreen("  [3] "); printLine(OrderOptions.CHIPS);
        printGreen("  [4] "); printLine(OrderOptions.DRINK);
        printCyan("  [5] "); printLine(OrderOptions.CHECKOUT);
        printCancelLine();
        printLine();

        while(true)
        {
            try
            {

                print("Please select and option: ");
                int option = getIntInput();

                switch (option)
                {
                    case 1:
                        return OrderOptions.SANDWICH;
                    case 2:
                        return OrderOptions.SIGNATURE;
                    case 3:
                        return OrderOptions.CHIPS;
                    case 4:
                        return OrderOptions.DRINK;
                    case 5:
                        return OrderOptions.CHECKOUT;
                    case 0:
                        return OrderOptions.CANCEL;
                }
            }
            catch (Exception e)
            {

            }
            printRedLine("The option you selected is invalid.");
        }

    }
}
