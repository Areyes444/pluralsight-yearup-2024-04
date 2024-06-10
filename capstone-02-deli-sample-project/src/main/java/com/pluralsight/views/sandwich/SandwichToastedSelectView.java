package com.pluralsight.views.sandwich;

import com.pluralsight.models.enumerations.Bread;
import com.pluralsight.views.ViewBase;

public class SandwichToastedSelectView extends ViewBase
{
    public Boolean getToastSelection()
    {
        printLine();
        printHeader("Would you like it Toasted?");

        printLine();
        printOptionLine(1,"Yes");
        printOptionLine(2,"No");
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
                        return true;
                    case 2:
                        return false;
                    case 0:
                        return null;
                }


            }
            catch (Exception e)
            {
            }

            printRedLine("The option you selected is invalid.");
        }
    }
}
