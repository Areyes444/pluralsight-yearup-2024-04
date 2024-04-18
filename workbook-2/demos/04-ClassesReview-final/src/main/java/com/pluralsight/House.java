package com.pluralsight;

public class House
{
    private int yearBuilt;
    private String insideColor;
    private String outsideColor;

    public House(int yearBuilt, String insideColor, String outsideColor)
    {
        this.yearBuilt = yearBuilt;
        this.insideColor = insideColor;
        this.outsideColor = outsideColor;
    }

    public int getYearBuilt()
    {
        return yearBuilt;
    }

    public String getInsideColor()
    {
        return insideColor;
    }
    public void setInsideColor(String insideColor)
    {
        this.insideColor = insideColor;
    }

    public String getOutsideColor()
    {
        return outsideColor;
    }
    public void setOutsideColor(String outsideColor)
    {
        this.outsideColor = outsideColor;
    }

    public void paintOutside(String color)
    {
        outsideColor = color;
    }

}
