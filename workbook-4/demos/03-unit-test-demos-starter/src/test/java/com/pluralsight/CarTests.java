package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTests
{
    @Test
    public void accelerateTest()
    {
        Car car = new Car("","");
        car.accelerate(20);
        assertEquals(20, car.getSpeed());
    }


    @Test
    public void accelerate_Should_IncreaseTheSpeedOfTheCar_WhenIAccelerateTwice()
    {
        //arrange- setup
        Car car = new Car("Ford", "Mustang");
        int increaseBy = 10;
        int expectedSpeed = 20;

        //act---> The One action that I am Testing
        car.accelerate(increaseBy);
        car.accelerate(increaseBy);

        //assert - verify that the action worked as expected
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed,actualSpeed,"Because the car started at 0, and increased the speed by 10 TWICE");
    }

    @Test
    public void accelerate_shouldNot_changeSpeed_WithNegativeInputs()
    {
        //arrange
        Car car = new Car("Ford","Mustang");
        int increaseBy = -20;
        int expectedSpeed = 0;

        //act
        car.accelerate(increaseBy);


        //assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed,actualSpeed,"Because a car cannot accelerate a negative speed.");
    }
}