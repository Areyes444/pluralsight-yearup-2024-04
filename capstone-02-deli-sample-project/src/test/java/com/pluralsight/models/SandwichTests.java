package com.pluralsight.models;

import com.pluralsight.models.enumerations.Size;
import com.pluralsight.models.products.Sandwich;
import com.pluralsight.models.toppings.Cheese;
import com.pluralsight.models.toppings.Meat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SandwichTests
{
    Sandwich sandwich;

    @BeforeEach
    void setUp()
    {
        sandwich = new Sandwich()
        {{
            setName("Gregor");
        }};
    }

    @Test
    public void getPrice_should_addMeatPrice_asPremium()
    {
        // arrange
        sandwich.setSize("Small");
        var steak = new Meat("Steak");
        sandwich.addTopping(steak);

        var expectedPrice = new BigDecimal("6.50");

        // act
        var actualPrice = sandwich.getPrice();

        // assert
        assertEquals(expectedPrice, actualPrice, "Because this Small sandwich has only 1 meat premium topping");


    }

    @Test
    public void getPrice_should_add2MeatPrices_asPremium()
    {
        // arrange
        sandwich.setSize("Small");
        var steak = new Meat("Steak");
        var ham = new Meat("Ham");
        sandwich.addTopping(steak);
        sandwich.addTopping(ham);

        var expectedPrice = new BigDecimal("7.00");

        // act
        var actualPrice = sandwich.getPrice();

        // assert
        assertEquals(expectedPrice, actualPrice, "Because this Small sandwich has 2 meat premium toppings");


    }

    @Test
    public void getPrice_should_addCheesePrice_asPremium()
    {
        // arrange
        sandwich.setSize("Small");
        var cheddar = new Cheese("Cheddar");
        sandwich.addTopping(cheddar);

        var expectedPrice = new BigDecimal("6.25");

        // act
        var actualPrice = sandwich.getPrice();

        // assert
        assertEquals(expectedPrice, actualPrice, "Because this Small sandwich has only 1 cheese premium topping");
    }

    @Test
    public void getPrice_should_add2CheesePrice_asPremium()
    {
        // arrange
        sandwich.setSize("Small");
        var cheddar = new Cheese("Cheddar");
        var cheddar2 = new Cheese("Cheddar");
        sandwich.addTopping(cheddar);
        sandwich.addTopping(cheddar2);

        var expectedPrice = new BigDecimal("6.55");

        // act
        var actualPrice = sandwich.getPrice();

        // assert
        assertEquals(expectedPrice, actualPrice, "Because this Small sandwich has 2 cheese premium topping2");
    }


    @Test
    public void getPrice_should_addMeatAndCheesePrice_asPremium()
    {
        // arrange
        sandwich.setSize("Small");
        var steak = new Meat("Steak");
        var cheddar = new Cheese("Cheddar");
        sandwich.addTopping(steak);
        sandwich.addTopping(cheddar);

        var expectedPrice = new BigDecimal("7.25");

        // act
        var actualPrice = sandwich.getPrice();

        // assert
        assertEquals(expectedPrice, actualPrice, "Because this Small sandwich has 1 meat and 1 cheese premium topping");

    }


    @Test
    public void getPrice_should_add2MeatAnd2CheesePrice_asPremium()
    {
        // arrange
        sandwich.setSize("Small");
        var steak = new Meat("Steak");
        var ham = new Meat("Ham");
        var cheddar = new Cheese("Cheddar");
        var cheddar2 = new Cheese("Cheddar");
        sandwich.addTopping(steak);
        sandwich.addTopping(ham);
        sandwich.addTopping(cheddar);
        sandwich.addTopping(cheddar2);

        var expectedPrice = new BigDecimal("8.05");

        // act
        var actualPrice = sandwich.getPrice();

        // assert
        assertEquals(expectedPrice, actualPrice, "Because this Small sandwich has 2 meat and 2 cheese premium toppings");

    }
}