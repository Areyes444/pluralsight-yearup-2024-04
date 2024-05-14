package com.pluralsight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVTests
{
    private TV tv;
    private final int MIN_CHANNEL = 2;
    private final int MAX_CHANNEL = 13;
    private final int DEFAULT_CHANNEL = 2;
    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 10;
    private final int DEFAULT_VOLUME = 3;

    @BeforeEach
    public void setup()
    {
        tv = new TV();
    }

    @Test
    public void changeChannel_should_succeed_forValidChannel()
    {
        // arrange
        int expectedChannel = 5;

        // act
        tv.changeChannel(5);

        // assert
        int actualChannel = tv.getChannel();
        assertEquals(expectedChannel, actualChannel, "Because I set the channel to 5");
    }

    @Test
    public void changeChannel_should_succeed_forLowestChannel()
    {
        // arrange
        int expectedChannel = MIN_CHANNEL;

        // act
        tv.changeChannel(MIN_CHANNEL);

        // assert
        int actualChannel = tv.getChannel();
        assertEquals(expectedChannel, actualChannel, "Because I set the channel to the lowest channel");
    }

    @Test
    public void changeChannel_should_succeed_forHighestChannel()
    {
        // arrange
        int expectedChannel = MAX_CHANNEL;

        // act
        tv.changeChannel(MAX_CHANNEL - 1);

        // assert
        int actualChannel = tv.getChannel();
        assertEquals(expectedChannel, actualChannel, "Because I set the channel to the highest channel");
    }

    @Test
    public void changeChannel_should_fail_forChannelTooHigh()
    {
        // arrange
        int expectedChannel = DEFAULT_CHANNEL;

        // act
        tv.changeChannel(MAX_CHANNEL + 1);

        // assert
        int actualChannel = tv.getChannel();
        assertEquals(expectedChannel, actualChannel, "Because I tried to set the channel too high");
    }

    @Test
    public void changeChannel_should_fail_forChannelTooLow()
    {
        // arrange
        int expectedChannel = DEFAULT_CHANNEL;

        // act
        tv.changeChannel(MIN_CHANNEL - 1);

        // assert
        int actualChannel = tv.getChannel();
        assertEquals(expectedChannel, actualChannel, "Because I tried to set the channel too low");
    }

    @Test
    public void channelUp_should_moveUpBy1_inMiddleRange()
    {
        // arrange
        int expectedChannel = DEFAULT_CHANNEL + 1;

        // act
        tv.channelUp();

        // assert
        int actualChannel = tv.getChannel();
        assertEquals(expectedChannel, actualChannel, "Because I changed the channel up 1");
    }

    @Test
    public void channelUp_should_rollOver_toLowestChannel()
    {
        // arrange
        int expectedChannel = MIN_CHANNEL - 1;
        tv.changeChannel(MAX_CHANNEL);

        // act
        tv.channelUp();

        // assert
        int actualChannel = tv.getChannel();
        assertEquals(expectedChannel, actualChannel, "Because I set the channel to the highest and then moved up 1");
    }

    @Test
    public void channelDown_should_rollOver_toHighestChannel()
    {
        // arrange
        int expectedChannel = MAX_CHANNEL;

        // act
        tv.channelDown();

        // assert
        int actualChannel = tv.getChannel();
        assertEquals(expectedChannel, actualChannel, "Because I was at channel 2 and changed the channel down 1");
    }


    // volume tests

    @Test
    public void changeVolume_should_succeed_forValidLevel()
    {
        // arrange
        int expectedVolume = 5;

        // act
        tv.changeVolume(5);

        // assert
        int actualVolume = tv.getVolume();
        assertEquals(expectedVolume, actualVolume, "Because I set the volume to 5");
    }

    @Test
    public void changeVolume_should_succeed_forLowestVolume()
    {
        // arrange
        int expectedVolume = MIN_VOLUME;

        // act
        tv.changeVolume(MIN_VOLUME);

        // assert
        int actualVolume = tv.getVolume();
        assertEquals(expectedVolume, actualVolume, "Because I set the volume to the lowest setting");
    }

    @Test
    public void changeVOlume_should_succeed_forHighestVolume()
    {
        // arrange
        int expectedVolume = MAX_VOLUME;

        // act
        tv.changeChannel(MAX_VOLUME - 1);

        // assert
        int actualVolume = tv.getVolume();
        assertEquals(expectedVolume, actualVolume, "Because I set the volume to the highest setting");
    }

    @Test
    public void changeVolume_should_fail_forVolumeTooHigh()
    {
        // arrange
        int expectedVolume = DEFAULT_VOLUME;

        // act
        tv.changeVolume(MAX_VOLUME + 1);

        // assert
        int actualVolume = tv.getVolume();
        assertEquals(expectedVolume, actualVolume, "Because I tried to set the volume too high");
    }

    @Test
    public void changeVolume_should_fail_forVolumeTooLow()
    {
        // arrange
        int expectedVolume = DEFAULT_VOLUME;

        // act
        tv.changeVolume(MIN_VOLUME - 1);

        // assert
        int actualVolume = tv.getVolume();
        assertEquals(expectedVolume, actualVolume, "Because I tried to set the volume too low");
    }

    @Test
    public void volumeUp_should_moveUpBy1_inMiddleRange()
    {
        // arrange
        int expectedVolume = DEFAULT_VOLUME + 1;

        // act
        tv.volumeUp();

        // assert
        int actualVolume = tv.getVolume();
        assertEquals(expectedVolume, actualVolume, "Because I changed the volume up 1");
    }

    @Test
    public void volumeUp_shouldNotRollover_toLowestVolume()
    {
        // arrange
        int expectedVolume = MAX_VOLUME;
        tv.changeVolume(MAX_VOLUME);

        // act
        tv.volumeUp();

        // assert
        int actualVolume = tv.getVolume();
        assertEquals(expectedVolume, actualVolume, "Because I set the volume to the highest and then moved up 1");
    }

    @Test
    public void volumeDown_shouldNotRollOver_toHighestVolume()
    {
        // arrange
        int expectedVolume = MIN_VOLUME;
        tv.changeVolume(MIN_VOLUME);

        // act
        tv.volumeDown();

        // assert
        int actualVolume = tv.getVolume();
        assertEquals(expectedVolume, actualVolume, "Because I was at volume 0 and decreased the volume by 1");
    }

}