package com.pluralsight.controllers;

import com.pluralsight.models.Order;
import com.pluralsight.services.Logger;
import com.pluralsight.services.SignatureSandwichBuilder;
import com.pluralsight.views.toppings.UserOptionSelectView;

public class SignatureSandwichController extends SandwichController
{
    private final SignatureSandwichBuilder builder = new SignatureSandwichBuilder();

    public SignatureSandwichController(Logger logger, Order order)
    {
        super(logger, order);
    }

    @Override
    public void home()
    {

        var signatures = productsService.getSignature();

        var view = new UserOptionSelectView(signatures, null);
        view.displayProductInfo("Select your Signature");
        var choice = view.getUserProductSelection();

        if(choice == null) return;

        if(!selectBread()) return;
        if(!selectSize()) return;

        sandwich = switch(choice.getDisplayOption())
        {
            case 2 -> builder.buildPhilly(sandwich);
            case 3 -> builder.buildFrenchDip(sandwich);
            default -> builder.buildBlt(sandwich);
        };

        order.addProduct(sandwich);
        displaySummary();
    }


}
