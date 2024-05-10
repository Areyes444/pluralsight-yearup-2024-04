package com.pluralsight;

import com.pluralsight.application.BlackJack;
import com.pluralsight.models.Card;
import com.pluralsight.models.Deck;

public class Main
{
    public static void main(String[] args)
    {
        BlackJack game = new BlackJack();
        game.run();
//        Deck deck = new Deck();
//        deck.shuffle();
//
//        System.out.println(deck.getCardCount());
//
//        Card card = deck.takeCard();
//        System.out.println(card.getFaceValue() + " of " + card.getSuit());
//
//        System.out.println(deck.getCardCount());
    }
}