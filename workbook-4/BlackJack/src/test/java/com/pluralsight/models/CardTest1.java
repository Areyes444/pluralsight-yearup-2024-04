package com.pluralsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest1
{

    @org.junit.jupiter.api.Test
    public void getColor_ShouldReturnRed_ForHearts()
    {
        //arrange
        Card card = new Card("hearts","Q");

        //act
        String color = card.getColor();

        //assert
        String expectedColor = "Red";
        assertEquals(expectedColor,color,"Because the card is a Queen of Hearts");
    }

   @Test
   public void getValue_ShouldReturn10_ForQ()
    {
        //arrange
        Card card = new Card("Hearts","Q");

        //act
        int pointValue = card.getPointValue();

        //assert
        int expectedPointValue = 10;
        assertEquals(expectedPointValue,pointValue,"Because the card is a Queen of Hearts so it should return 10.");
    }
}