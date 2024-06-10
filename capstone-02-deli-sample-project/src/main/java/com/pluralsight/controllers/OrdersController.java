package com.pluralsight.controllers;

import com.pluralsight.models.Order;
import com.pluralsight.services.Logger;
import com.pluralsight.services.receipts.ReceiptService;
import com.pluralsight.views.MessageView;
import com.pluralsight.views.orders.NewOrderView;
import com.pluralsight.views.orders.OrderDetailView;
import com.pluralsight.views.orders.OrderHomeView;
import com.pluralsight.views.orders.OrderSummaryView;

public class OrdersController extends Controller
{
    private ReceiptService receiptService;
    private Order order;

    public OrdersController(Logger logger)
    {
        super(logger);
        receiptService = new ReceiptService(logger);
        Order.setNextId(receiptService.getNextOrderNumber());

        order = new Order();
    }

    public void home()
    {
        var view = new NewOrderView();

        var name = view.display(order);
        order.setName(name);

        buildOrder();
    }

    private void displaySummary()
    {
        var view = new OrderSummaryView();
        view.displaySummary(order);
    }

    private void buildOrder()
    {
        while(true)
        {
            displaySummary();

            var view = new OrderHomeView();
            var choice = view.getOrderOptionSelection();
            
            switch (choice)
            {
                case SANDWICH -> buildCustomSandwich();
                case SIGNATURE -> addSignature();
                case CHIPS -> addChips();
                case DRINK -> addDrink();
                case CHECKOUT ->
                {
                    checkout();
                    return;
                }
                case CANCEL ->
                {
                    cancel();
                    return;
                }
            }

        }
    }

    private void cancel()
    {
        var view = new MessageView();
        view.display("Order " + order.getId() + " has been cancelled.");
        order = new Order();
    }

    private void buildCustomSandwich()
    {
        var sandwichController = new SandwichController(logger, order);
        sandwichController.home();
    }

    private void addSignature()
    {
        var signatureController = new SignatureSandwichController(logger, order);
        signatureController.home();
    }

    private void addChips()
    {
        var controller = new ChipsController(logger, order);
        controller.home();
    }

    private void addDrink()
    {
        var controller = new DrinksController(logger, order);
        controller.home();
    }

    private boolean checkout()
    {
        var view = new OrderDetailView();
        var placeOrder = view.printOrder(order);

        if( placeOrder)
        {
            // print receipt
            receiptService.createRecipt(order);
        }

        return placeOrder;
    }
}
