package com.pluralsight.controllers;

import com.pluralsight.services.Logger;

public abstract class Controller
{
    protected Logger logger;

    public Controller(Logger logger)
    {
        this.logger = logger;
    }

    public abstract void home();
}
