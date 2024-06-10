package com.pluralsight.views;

import com.pluralsight.models.data.SizeType;

import java.util.List;

public class SizeSelectView extends ViewBase
{
    private List<SizeType> sizes;

    public SizeSelectView(List<SizeType> sizes)
    {
        this.sizes = sizes;
    }

    public SizeType getSizeSelection()
    {
        printLine();
        printHeader("What size would you like?");

        printLine();
        sizes.forEach(size -> {
            String sizeName = String.format("%-7s ($ %.2f)",size.getName(), size.getPrice());
            printOptionLine(size.getDisplayOption(), sizeName );
        });
        printCancelLine();
        printLine();

        while(true)
        {
            try
            {
                printYellow("Please select and option: ");
                int option = getIntInput();

                // cancel
                if(option == 0) return null;

                var selection = sizes.stream().filter(s -> s.getDisplayOption() == option).findFirst();
                if(selection.isPresent())
                {
                    return selection.get();
                }
                printLine();
                printRedLine("The option you selected is invalid.");
            }
            catch (Exception e)
            {
            }
        }
    }
}
