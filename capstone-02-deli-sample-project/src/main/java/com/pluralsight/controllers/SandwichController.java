package com.pluralsight.controllers;

import com.pluralsight.models.Order;
import com.pluralsight.models.products.Sandwich;
import com.pluralsight.models.toppings.*;
import com.pluralsight.services.data.CsvProductTypesService;
import com.pluralsight.services.Logger;
import com.pluralsight.services.data.ProductTypesService;
import com.pluralsight.services.data.SizeTypeService;
import com.pluralsight.views.sandwich.SandwichToastedSelectView;
import com.pluralsight.views.toppings.*;
import com.pluralsight.views.sandwich.SandwichBreadSelectView;
import com.pluralsight.views.SizeSelectView;
import com.pluralsight.views.sandwich.SandwichSummaryView;

import java.util.List;

public class SandwichController extends Controller
{
    protected ProductTypesService productsService = new CsvProductTypesService(logger);
    protected SizeTypeService sizeTypeService = new SizeTypeService(logger);

    protected Order order;
    protected Sandwich sandwich;

    public SandwichController(Logger logger, Order order)
    {
        super(logger);

        this.order = order;
        sandwich = new Sandwich();
    }

    @Override
    public void home()
    {
        if(!selectBread()) return;
        if(!selectSize()) return;
        if(!selectToasted()) return;

        addMeat();
        addCheese();
        addToppings();
        addSauces();
        addSides();

        displaySummary();

        order.addProduct(sandwich);
    }

    protected void displaySummary()
    {

        var view = new SandwichSummaryView();
        view.printSandwichSummary(sandwich, true);
    }

    protected void displayToppings(List<Topping> toppings)
    {
        var viewToppings = new ToppingListDisplayView();
        viewToppings.printToppings(toppings);
    }

    protected boolean selectBread()
    {
        var breadTypes = productsService.getBread();
        var view = new SandwichBreadSelectView(breadTypes);
        var bread = view.getBreadSelection();

        if(bread == null) return false;

        sandwich.setBread(bread.getName());
        return true;
    }

    protected boolean selectSize()
    {
        var sizeTypes = sizeTypeService.getBread();
        var view = new SizeSelectView(sizeTypes);
        var size = view.getSizeSelection();

        if(size == null) return false;

        sandwich.setSize(size.getName());
        return true;
    }

    private boolean selectToasted()
    {
        var view = new SandwichToastedSelectView();
        var isToasted = view.getToastSelection();

        if(isToasted == null) return false;

        sandwich.setToasted(isToasted);
        return true;
    }

    private void addMeat()
    {
        var meats = productsService.getMeat();
        var sizes = sizeTypeService.getMeat();

        var view = new UserOptionSelectView(meats, sizes);
        view.displayProductInfo("Select Premium Meat Toppings");

        while(true)
        {
            displayToppings(sandwich.getMeatToppings());

            var choice = view.getUserProductSelection();

            if (choice == null)
            {
                break;
            }
            var meat = new Meat(choice.getName());
            sandwich.addTopping(meat);
        }
    }

    private void addCheese()
    {
        var cheeses = productsService.getCheese();
        var sizes = sizeTypeService.getCheese();

        var view = new UserOptionSelectView(cheeses, sizes);
        view.displayProductInfo("Select Premium Cheese Toppings");

        while(true)
        {
            displayToppings(sandwich.getCheeseToppings());

            var choice = view.getUserProductSelection();

            if (choice == null)
            {
                break;
            }
            var cheese = new Cheese(choice.getName());
            sandwich.addTopping(cheese);
        }
    }

    private void addToppings()
    {
        var toppings = productsService.getRegularToppings();

        var view = new UserOptionSelectView(toppings, null);
        view.displayProductInfo("Select Standard Toppings");

        while(true)
        {
            displayToppings(sandwich.getRegularToppings());

            var choice = view.getUserProductSelection();

            if (choice == null)
            {
                break;
            }
            var topping = new Topping(choice.getName());
            sandwich.addTopping(topping);
        }
    }

    private void addSauces()
    {
        var sauces = productsService.getSauces();

        var view = new UserOptionSelectView(sauces, null);
        view.displayProductInfo("Select Sauces");

        while(true)
        {
            displayToppings(sandwich.getSauces());

            var choice = view.getUserProductSelection();

            if (choice == null)
            {
                break;
            }
            var sauce = new Sauce(choice.getName());
            sandwich.addTopping(sauce);
        }
    }

    private void addSides()
    {
        var sides = productsService.getSides();

        var view = new UserOptionSelectView(sides, null);
        view.displayProductInfo("Select Sides");

        while(true)
        {
            displayToppings(sandwich.getSides());

            var choice = view.getUserProductSelection();

            if (choice == null)
            {
                break;
            }
            var side = new Side(choice.getName());
            sandwich.addTopping(side);
        }
    }
}
