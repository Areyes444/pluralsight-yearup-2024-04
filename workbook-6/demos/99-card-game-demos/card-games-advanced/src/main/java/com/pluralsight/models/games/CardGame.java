package com.pluralsight.models.games;

import com.pluralsight.models.hands.BlackJackHand;
import com.pluralsight.models.hands.Hand;
import com.pluralsight.models.players.Player;
import com.pluralsight.models.cards.Card;
import com.pluralsight.models.cards.Dealer;
import com.pluralsight.models.cards.Deck;

import java.util.LinkedList;
import java.util.Queue;

public abstract class CardGame<T extends Hand>
{
    protected Dealer dealer;
    protected Deck deck;
    protected Queue<Player<T>> players;
    protected Player<T> winner;

    public CardGame(Deck deck)
    {
        this.deck = deck;
        this.dealer = new Dealer(deck);

        players = new LinkedList<>();
    }

    public Queue<Player<T>> getPlayers()
    {
        return players;
    }

    public Player<T> getNextPlayer()
    {
        var player = players.remove();
        players.offer(player);

        return player;
    }

    public Player<T> getWinner()
    {
        return winner;
    }

    public abstract void dealPlayersIn();

    public void join(Player<T> player)
    {
        players.offer(player);
    }

    public void deal(Player<T> player)
    {
        Card card = dealer.deal();
        player.deal(card);
    }

    public abstract void endGame();
}
