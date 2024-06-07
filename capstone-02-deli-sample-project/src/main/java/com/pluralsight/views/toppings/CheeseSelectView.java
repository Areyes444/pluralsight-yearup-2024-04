package com.pluralsight.views.toppings;

import com.pluralsight.views.ViewBase;
import com.pluralsight.views.enumerations.MeatOptions;

public class MeatSelectView extends ViewBase<MeatOptions>
{
    @Override
    public void display()
    {

        print("Please select and option: ");
        int option = getIntInput();

        switch (option)
        {
            case 1:
               setModel(MeatOptions.STEAK);
               break;
            case 2:
                setModel(MeatOptions.HAM);
                break;
            case 3:
                setModel(MeatOptions.SALAMI);
                break;
            case 4:
                setModel(MeatOptions.ROAST_BEEF);
                break;
            case 5:
                setModel(MeatOptions.CHICKEN);
                break;
            case 6:
                setModel(MeatOptions.BACON);
                break;
            default:
                setModel(MeatOptions.DONE);
                break;
        }
    }
}
