package com.pluralsight.application;

import com.pluralsight.models.Card;
import com.pluralsight.models.Deck;
import com.pluralsight.models.Hand;
import com.pluralsight.ui.UserInterface;

import java.util.ArrayList;

public class BlackJack
{
    Deck deck = new Deck();
    ArrayList<Hand> players = new ArrayList<Hand>();
    Hand winner = new Hand("no winner");
    
    public void run()
    {
        addPlayers();
        dealCards();
        UserInterface.displayAllPlayersCards(players);
        findWinner();
        UserInterface.displayWinner(winner);
    }

    private void findWinner()
    {
        for (Hand player: players)
        {
            int points = player.getPointValue();
            if(points > winner.getPointValue() && points <= 21 )
            {
                winner = player;
            }
        }
    }

    private void dealCards()
    {
        deck.shuffle();

        for (int i = 0; i < 2; i++)
        {
            for(Hand player : players)
            {
                Card card = deck.takeCard();
                player.deal(card);
            }
        }
    }

    private void addPlayers()
    {
        players.add(new Hand("Hassan"));
        players.add(new Hand("Guy"));
        players.add(new Hand("Alexis"));
        players.add(new Hand("Angelica"));
    }
}
