package com.pluralsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTests
{

    @Test
    public void getColor_shouldReturnRed_forHearts()
    {
        // arrange
        Card card = new Card("Hearts", "Q");

        // act
        String color = card.getColor();

        // assert
        String expectedColor = "Red";
        assertEquals(expectedColor, color, "Because the card is a Queen of Hearts");
    }

    @Test
    public void getColor_shouldReturnBlack_forSpades()
    {
        // arrange
        Card card = new Card("Spades", "Q");

        // act
        String color = card.getColor();

        // assert
        String expectedColor = "Black";
        assertEquals(expectedColor, color, "Because the card is a Queen of Spades");
    }

    @Test
    public void getPoint_shouldReturn10_forQueen()
    {
        // arrange
        Card card = new Card("Hearts", "Q");

        // act
        int pointValue = card.getPointValue();

        // assert
        int expectedPointValue = 10;
        assertEquals(expectedPointValue, pointValue, "Because the card is a Queen of Hearts");
    }

    @Test
    public void getPoint_shouldReturn11_forAce()
    {
        // arrange
        Card card = new Card("Hearts", "A");

        // act
        int pointValue = card.getPointValue();

        // assert
        int expectedPointValue = 11;
        assertEquals(expectedPointValue, pointValue, "Because the card is a Ace of Hearts");
    }

    @Test
    public void getPoint_shouldReturnNUmber_forBasicCards()
    {
        // arrange
        Card card = new Card("Hearts", "8");

        // act
        int pointValue = card.getPointValue();

        // assert
        int expectedPointValue = 8;
        assertEquals(expectedPointValue, pointValue, "Because the card is a 8 of Hearts");
    }

}