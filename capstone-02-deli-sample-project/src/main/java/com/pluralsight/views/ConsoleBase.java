package com.pluralsight.views;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public abstract class ConsoleBase
{
    private Scanner in;
    protected PrintStream out;

    public ConsoleBase()
    {
        in = new Scanner(System.in);
        out = System.out;
    }

    // for unit testing
    public ConsoleBase(InputStream in, PrintStream out)
    {
        this.in = new Scanner(in);
        this.out = out;
    }

    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String RESET = "\u001B[0m";

    public void print(Object message)
    {
        out.print(message);
    }
    public void printBlack(Object message)
    {
        out.print(BLACK + message + RESET);
    }
    public void printRed(Object message)
    {
        out.print(RED + message + RESET);
    }
    public void printGreen(Object message)
    {
        out.print(GREEN + message + RESET);
    }
    public void printYellow(Object message)
    {
        out.print(YELLOW + message + RESET);
    }
    public void printBlue(Object message)
    {
        out.print(BLUE + message + RESET);
    }
    public void printPurple(Object message)
    {
        out.print(PURPLE + message + RESET);
    }
    public void printCyan(Object message)
    {
        out.print(CYAN + message + RESET);
    }
    public void printWhite(Object message)
    {
        out.print(WHITE + message + RESET);
    }


    public void printLine()
    {
        out.println();
    }
    public void printLine(Object message)
    {
        out.println(message);
    }
    public void printBlackLine(Object message)
    {
        printBlack(message);
        out.println();
    }
    public void printRedLine(Object message)
    {
        printRed(message);
        out.println();
    }
    public void printGreenLine(Object message)
    {
        printGreen(message);
        out.println();
    }
    public void printYellowLine(Object message)
    {
        printYellow(message);
        out.println();
    }
    public void printBlueLine(Object message)
    {
        printBlue(message);
        out.println();
    }
    public void printPurpleLine(Object message)
    {
        printPurple(message);
        out.println();
    }
    public void printCyanLine(Object message)
    {
        printCyan(message);
        out.println();
    }
    public void printWhiteLine(Object message)
    {
        printWhite(message);
        out.println();
    }

    public String getStringInput()
    {
        return in.nextLine().strip();
    }

    public int getIntInput()
    {
        return Integer.parseInt(in.nextLine());
    }

    public double getDoubleInput()
    {
        return Double.parseDouble(in.nextLine());
    }

    public void waitForUser()
    {
        print("Press ENTER to continue...");
        in.nextLine();
    }
}
