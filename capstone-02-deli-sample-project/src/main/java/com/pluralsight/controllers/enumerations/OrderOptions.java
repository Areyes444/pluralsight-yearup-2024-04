package com.pluralsight.controllers.enumerations;

public enum OrderOptions
{
    SANDWICH("Add Custom Sandwich"),
    SIGNATURE("Add Signature Sandwich"),
    DRINK("Add Drink"),
    CHIPS("Add Chips"),
    SIDE("Add Side"),
    CHECKOUT("Checkout"),
    CANCEL("Cancel Order");

    private final String val;

    OrderOptions(String val)
    {
        this.val = val;
    }

    @Override
    public String toString()
    {
        return val;
    }
}
