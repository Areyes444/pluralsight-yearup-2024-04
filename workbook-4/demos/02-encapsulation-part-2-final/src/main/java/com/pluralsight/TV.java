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

    // channelUp() go to 13 and then cycle to 2

    // channelDown() go to 2 and then cycle to 13

    // volumeUp() go to 10 but not beyond

    // volumeDown() go to 0 but not below
}
