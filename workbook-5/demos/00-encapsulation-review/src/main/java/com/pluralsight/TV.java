package com.pluralsight;

public class TV
{
    // channels 2 - 13 (old TV)
    private int channel;
    // volume 0 - 10
    private int volume;
    private boolean isOn;

    public TV()
    {
        channel = 2;
        volume = 3;
        isOn = false;
    }

    public int getChannel()
    {
        return channel;
    }

    public int getVolume()
    {
        return volume;
    }

    public boolean isOn()
    {
        return isOn;
    }

    // Add code to the following methods

    // channel methods

    // set specific channel
    public void changeChannel(int channel)
    {

    }

    // change channel up
    public void channelUp()
    {

    }

    // change channel down
    public void channelDown()
    {

    }


    // volume control

    // set specific volume
    public void changeVolume(int volume)
    {

    }


    // turn volume up
    public void volumeUp()
    {

    }

    // turn volume down
    public void volumeDown()
    {

    }
}