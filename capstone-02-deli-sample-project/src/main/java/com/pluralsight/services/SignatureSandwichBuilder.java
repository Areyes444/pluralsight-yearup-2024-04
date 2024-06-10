package com.pluralsight.services;

import com.pluralsight.controllers.enumerations.*;
import com.pluralsight.models.products.Sandwich;
import com.pluralsight.models.toppings.*;

public class SignatureSandwichBuilder
{
    public Sandwich buildBlt(Sandwich blt)
    {
        blt.setName("BLT");
        blt.setToasted(true);

        blt.addTopping(new Meat("Bacon"));
        blt.addTopping(new Cheese("Cheddar"));
        blt.addTopping(new Topping("Lettuce"));
        blt.addTopping(new Topping("Tomatoes"));
        blt.addTopping(new Sauce("Mayo"));

        return blt;
    }

    public Sandwich buildPhilly(Sandwich philly)
    {
        philly.setName("Philly Cheese Steak");
        philly.setToasted(true);

        philly.addTopping(new Meat("Steak"));
        philly.addTopping(new Meat("Steak"));
        philly.addTopping(new Cheese("Provolone"));
        philly.addTopping(new Topping("Peppers"));
        philly.addTopping(new Topping("Onions"));
        philly.addTopping(new Sauce("Mayo"));

        return philly;
    }

    public Sandwich buildFrenchDip(Sandwich frenchDip)
    {
        frenchDip.setName("Philly Cheese Steak");
        frenchDip.setToasted(true);

        frenchDip.addTopping(new Meat("Steak"));
        frenchDip.addTopping(new Meat("Steak"));
        frenchDip.addTopping(new Cheese("Provolone"));
        frenchDip.addTopping(new Side("Au Jus"));

        return frenchDip;
    }
}
