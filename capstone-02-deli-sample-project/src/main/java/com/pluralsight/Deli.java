package com.pluralsight;

import com.pluralsight.controllers.HomeController;
import com.pluralsight.services.Logger;

public class Deli
{
    public static void main(String[] args)
    {
        Logger logger = new Logger("errors.log");

        HomeController app = new HomeController(logger);
        app.home();
    }
}