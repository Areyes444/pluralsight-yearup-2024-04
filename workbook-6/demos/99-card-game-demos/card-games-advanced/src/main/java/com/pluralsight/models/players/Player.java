package com.pluralsight.models.players;

import com.pluralsight.models.cards.Card;
import com.pluralsight.models.hands.BlackJackHand;
import com.pluralsight.models.hands.Hand;

public class Player<T extends Hand>
{
    private String name;
    private T hand;

    public Player(String name, T hand)
    {
        this.name = name;
        this.hand = hand;
    }

    public void deal(Card card)
    {
        hand.deal(card);
    }

    public String getName()
    {
        return name;
    }

    public T showHand()
    {
        hand.show();
        return hand;
    }

    public int getHandValue()
    {
        return hand.getValue();
    }
}
