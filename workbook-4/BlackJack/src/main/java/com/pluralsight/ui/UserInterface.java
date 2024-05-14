package com.pluralsight.ui;

import com.pluralsight.models.Hand;

import java.util.ArrayList;

public class UserInterface
{
    public static void displayAllPlayersCards(ArrayList<Hand>players)
    {
        System.out.println("All Players");
        System.out.println("-".repeat(30));
        for(Hand player : players)
        {
            System.out.println(player.getPlayerName() + ": " + player.getPointValue());
        }
    }

    public static void displayWinner(Hand winner)
    {
        System.out.println();
        System.out.println("*".repeat(30));
        System.out.println("         WINNER     " + winner.getPlayerName());
        System.out.println("*".repeat(30));

    }
}
