package com.pluralsight.models;

import java.util.ArrayList;

public class Hand
{
    private ArrayList<Card> cards;
    private String playerName;

    public Hand(String playerName)
    {
        this.playerName = playerName;
        cards = new ArrayList<>();
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public ArrayList<Card> getCards()
    {
        return cards;
    }

    public int getPointValue()
    {
        // return sum of all card points
        int sum = 0;

        for(Card card : cards)
        {
            sum += card.getPointValue();
        }
        return sum;
    }

    public int getCardCount()
    {
        return cards.size();
    }


    public void deal(Card card)
    {
        cards.add(card);
    }
}
