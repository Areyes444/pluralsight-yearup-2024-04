package com.pluralsight.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HandTests
{
    @Test
    public void deal_should_increaseCardCount()
    {
        // arrange
        Hand hand = new Hand("Hassan");
        Card card = new Card("Diamonds", "9");
        Card card2 = new Card("Spades", "A");

        // act
        hand.deal(card);
        hand.deal(card2);

        // assert
        int expectedCardCount = 2;
        int cardCount = hand.getCardCount();
        assertEquals(expectedCardCount, cardCount, "Because we dealt 2 cards");

        // verify that the 2 cards I dealt are ACTUALLY in the card list
        ArrayList<Card> cards = hand.getCards(); // get the list of cards in the hand
        assertTrue(cards.contains(card), "Because the 9 of Diamonds should be in the list of cards");
        assertTrue(cards.contains(card2), "Because the A of Spades should be in the list of cards");
    }

}