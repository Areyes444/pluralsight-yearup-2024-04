package com.pluralsight.controllers;

import com.pluralsight.services.Logger;
import com.pluralsight.views.MessageView;
import com.pluralsight.views.home.HomeView;

public class HomeController extends Controller
{
    public HomeController(Logger logger)
    {
        super(logger);
    }

    public void home()
    {
        var view = new HomeView();
        while(true)
        {
            var choice = view.getUserSelection();
            
            switch(choice)
            {
                case ORDER -> beginOrder();
                case EXIT ->
                {
                    exit();
                    return;
                }
            }
        }
    }

    private void beginOrder()
    {
        OrdersController ordersController = new OrdersController(logger);
        ordersController.home();
    }

    private void exit()
    {
        var view = new MessageView();
        view.display("Enjoy your Sandwich and come again!\n");
    }
}
