package com.pluralsight.views;

import java.io.InputStream;
import java.io.PrintStream;

public abstract class ViewBase extends ConsoleBase
{
    protected static final int HEADER_WIDTH = 50;

    public ViewBase()
    {
    }

    // for unit testing
    public ViewBase(InputStream in, PrintStream out)
    {
        super(in, out);
    }

    public void printOptionLine(int id, String option)
    {
        printGreen("  [" + id + "] ");
        printLine(option);
    }

    public void printDoneLine()
    {
        printCyan("  [0] ");
        printLine("Done");
    }

    public void printCancelLine()
    {
        printRed("  [0] ");
        printLine("Cancel");
    }


    public void printSeparator(String message)
    {
        int remainingSpace = HEADER_WIDTH - message.length() - 2;
        int front = (remainingSpace / 2);
        int back = remainingSpace - front;

        printBlue("-".repeat(front));
        printWhite(" " + message + " ");
        printBlueLine("-".repeat(back));

    }


    public void printHeader(String message)
    {
        int remainingSpace = HEADER_WIDTH - message.length();
        int front = remainingSpace / 2;

        printYellowLine("•".repeat(50));
        print(" ".repeat(front));
        printLine(message);
        printYellowLine("•".repeat(50));
    }
}
