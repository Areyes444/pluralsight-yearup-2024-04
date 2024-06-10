package com.pluralsight.controllers;

import com.pluralsight.models.Order;
import com.pluralsight.models.products.Drink;
import com.pluralsight.services.Logger;
import com.pluralsight.services.data.CsvProductTypesService;
import com.pluralsight.services.data.SizeTypeService;
import com.pluralsight.views.SizeSelectView;
import com.pluralsight.views.toppings.UserOptionSelectView;

public class DrinksController extends Controller
{
    CsvProductTypesService productsService = new CsvProductTypesService(logger);
    SizeTypeService sizeTypeService = new SizeTypeService(logger);

    private Order order;
    private Drink drink;

    public DrinksController(Logger logger, Order order)
    {
        super(logger);

        this.order = order;
        drink = new Drink();
    }

    @Override
    public void home()
    {
        if(!selectFlavor()) return;
        if(!selectSize()) return;

        order.addProduct(drink);
    }

    private boolean selectSize()
    {
        var sizes = sizeTypeService.getDrinks();
        var view = new SizeSelectView(sizes);
        var size = view.getSizeSelection();

        if(size == null) return false;

        drink.setSize(size.getName());
        return true;
    }

    private boolean selectFlavor()
    {
        var drinks = productsService.getDrinks();
        var sizes = sizeTypeService.getDrinks();
        var view = new UserOptionSelectView(drinks, sizes);

        view.displayProductInfo("Select Drink");
        var selected = view.getUserProductSelection();

        if(selected == null) return false;

        drink.setName(selected.getName());

        return true;
    }
}
