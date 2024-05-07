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
}
