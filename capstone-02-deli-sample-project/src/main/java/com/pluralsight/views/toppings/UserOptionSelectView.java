package com.pluralsight.views.toppings;

import com.pluralsight.models.data.ProductType;
import com.pluralsight.models.data.SizeType;
import com.pluralsight.views.ViewBase;

import java.util.List;

public class UserOptionSelectView extends ViewBase
{
    private List<ProductType> toppings;
    private List<SizeType> sizes;

    public UserOptionSelectView(List<ProductType> toppings, List<SizeType> sizes)
    {
        this.toppings = toppings;
        this.sizes = sizes;
    }

    public void displayProductInfo(String header)
    {
        printLine();
        printHeader(header);
        if(sizes != null && !sizes.isEmpty()) printSizes();

        printLine();
        toppings.forEach(topping -> {
            printOptionLine(topping.getDisplayOption(), topping.getName());
        });
        printDoneLine();
        printLine();
    }

    public ProductType getUserProductSelection()
    {
        while(true)
        {
            try
            {
                printYellow("Please select and option: ");
                int option = getIntInput();

                // cancel
                if(option == 0)
                {
                    printLine();
                    return null;
                }

                var selection = toppings.stream().filter(t -> t.getDisplayOption() == option).findFirst();
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

    private void printSizes()
    {
        printSeparator("Sizes");
        printLine(String.format("            %-8s %-7s %-7s", "Size", "Price", "Extra"));
        printLine("            -------- ------- -------");
        sizes.forEach(size -> {
            String sizeName = String.format("            %-8s $ %-5.2f $ %-5.2f",size.getName(), size.getPrice(), size.getExtraPrice());
            printCyanLine(sizeName);
        });
        printBlueLine("-".repeat(50));
    }
}
