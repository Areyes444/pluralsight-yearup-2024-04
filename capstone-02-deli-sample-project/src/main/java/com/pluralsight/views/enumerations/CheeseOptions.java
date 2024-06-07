package com.pluralsight.views.enumerations;

public enum MeatOptions
{
    STEAK("Steak"),
    HAM("Ham"),
    SALAMI("Salami"),
    ROAST_BEEF("Roast Beef"),
    CHICKEN("Chicken"),
    BACON("Bacon"),
    DONE("Done");

    private final String val;

    MeatOptions(String val)
    {
        this.val = val;
    }

    @Override
    public String toString()
    {
        return val;
    }
}
