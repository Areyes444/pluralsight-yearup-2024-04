package com.pluralsight.models.games;

import com.pluralsight.models.hands.Hand;
import com.pluralsight.models.players.Player;
import com.pluralsight.models.cards.Deck;

import java.util.Stack;

public abstract class ReversibleGame extends CardGame<Hand>
{
    public ReversibleGame(Deck deck)
    {
        super(deck);
    }

    public void reverse()
    {
        // add all players to the stack - first player at bottom
        Stack<Player<Hand>> stack = new Stack<>();
        for(Player<Hand> player : players)
        {
            stack.push(player);
        }

        // clear current player list
        players.clear();

        // add all players back from the stack - previously last player first, from the top of the stack
        while(!stack.isEmpty())
        {
            Player<Hand> player = stack.pop();
            players.offer(player);
        }
    }
}
