package com.pluralsight.ui;

import com.pluralsight.models.Card;
import com.pluralsight.models.Hand;

import java.util.ArrayList;

public class UserInterface
{
    public static void displayAllPlayersCards(ArrayList<Hand> players)
    {
        System.out.println("All Players");
        System.out.println("-".repeat(30));
        for (Hand player : players)
        {
            System.out.println(player.getPlayerName() + ": " + player.getPointValue());
            for (Card card : player.getCards())
            {
                System.out.println("  " + card.getFaceValue() + " of " + card.getSuit());
            }
            System.out.println();
        }
    }

    public static void displayWinner(Hand winner)
    {
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("           WINNER: " + winner.getPlayerName());
        System.out.println("*****************************************");
    }
}
