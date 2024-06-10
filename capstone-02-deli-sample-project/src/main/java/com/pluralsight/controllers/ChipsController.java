package com.pluralsight.controllers;

import com.pluralsight.models.Order;
import com.pluralsight.models.products.Chips;
import com.pluralsight.services.Logger;
import com.pluralsight.services.data.CsvProductTypesService;
import com.pluralsight.views.toppings.UserOptionSelectView;

public class ChipsController extends Controller
{
    CsvProductTypesService productsService = new CsvProductTypesService(logger);

    private Order order;
    private Chips chips;

    public ChipsController(Logger logger, Order order)
    {
        super(logger);

        this.order = order;
        chips = new Chips();
    }

    @Override
    public void home()
    {
        if(!selectFlavor()) return;
        order.addProduct(chips);
    }

    private boolean selectFlavor()
    {
        var chipOptions = productsService.getChips();
        var view = new UserOptionSelectView(chipOptions, null);
        view.displayProductInfo("Select Chips");
        var selected = view.getUserProductSelection();

        if(selected == null) return false;

        chips.setName(selected.getName());

        return true;
    }
}
