package com.pluralsight.views;

import com.pluralsight.views.enumerations.HomeOptions;

import java.io.InputStream;
import java.io.PrintStream;

public class HomeView extends ViewBase<HomeOptions>
{
    public HomeView()
    {
    }

    public HomeView(InputStream in, PrintStream out)
    {
        super(in, out);
    }

    @Override
    public void display()
    {
        while(true)
        {
            printLine();
            printYellow("""
                    ---------------------------------------------
                                Welcome to the Deli
                    ---------------------------------------------

                    What do you want to do today?
                    
                    """);
            printGreen("[1] ");
            printLine("Place an order");
            printRed("[0] ");
            printLine("Exit");

            printYellow("Please select and option: ");
            int option = getIntInput();

            switch(option)
            {
                case 1:
                    setModel(HomeOptions.ORDER);
                    return;
                case 2:
                    setModel(HomeOptions.EXIT);
                    return;
            }

            printLine();
            printRedLine("The option you selected is invalid.");

            waitForUser();
        }
    }
}
