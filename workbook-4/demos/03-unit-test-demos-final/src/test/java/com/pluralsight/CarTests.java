package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTests
{

    @Test
    public void accelerate_Should_IncreaseTheSpeedOfTheCar_WhenItAcceleratesTwice()
    {
        // arrange - setup
        Car car = new Car("Ford", "Mustang");
        int increaseBy = 10;
        int expectedSpeed = 20;

        // act --> THE ONE action that I am testing
        car.accelerate(increaseBy);
        car.accelerate(increaseBy);

        // assert - verify that the action worked as expected
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed, "Because the car started at 0, and increased the speed by 10 TWICE");
    }

    @Test
    public void accelerate_ShouldNot_changeSpeed_WithNegativeInputs()
    {
        // arrange
        Car car = new Car("Ford", "Mustang");
        int increaseBy = -20;
        int expectedSpeed = 0;

        // act
        car.accelerate(increaseBy);

        // assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed, "Because a car cannot accelerate a negative speed");
    }

    @Test
    public void accelerate_ShouldNot_throwException_WithNegativeInputs()
    {
        // arrange
        Car car = new Car("Ford", "Mustang");
        int increaseBy = -20;
        int expectedSpeed = 0;

        // act
        // assert
        assertDoesNotThrow(() -> car.accelerate(increaseBy));

    }
}