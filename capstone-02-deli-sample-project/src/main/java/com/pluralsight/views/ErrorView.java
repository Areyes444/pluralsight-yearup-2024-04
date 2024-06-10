package com.pluralsight.views;

public class ErrorView extends ViewBase
{
    public void display(String message)
    {
        printLine();
        printRedLine(message);
    }
}
