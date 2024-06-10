package com.pluralsight.views.home;

import com.pluralsight.views.ViewBase;
import com.pluralsight.controllers.enumerations.HomeOptions;

import java.io.InputStream;
import java.io.PrintStream;

public class HomeView extends ViewBase
{
    public HomeView()
    {
    }

    public HomeView(InputStream in, PrintStream out)
    {
        super(in, out);
    }

    public HomeOptions getUserSelection()
    {
        while(true)
        {
            printLine();
            printHeader("Welcome to the Deli");

            printLine("What do you want to do today?");

            printLine();
            printGreen("  [1] "); printLine(HomeOptions.ORDER);
            printRed("  [0] "); printLine(HomeOptions.EXIT);
            printLine();

            print("Please select and option: ");
            int option = getIntInput();

            switch(option)
            {
                case 1:
                    return HomeOptions.ORDER;
                case 0:
                    return HomeOptions.EXIT;
            }

            printLine();
            printRedLine("The option you selected is invalid.");

            waitForUser();
        }
    }
}
