package com.pluralsight.views;

public class MessageView extends ViewBase
{
    public void display(String message)
    {
        printLine();
        printLine(message);
    }
}
