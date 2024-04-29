package com.pluralsight.models;

public class City
{
    private String name;
    private String stateCode;
    private String state;
    private String country;

    public City(String name, String stateCode, String state, String country)
    {
        this.name = name;
        this.stateCode = stateCode;
        this.state = state;
        this.country = country;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getStateCode()
    {
        return stateCode;
    }

    public void setStateCode(String stateCode)
    {
        this.stateCode = stateCode;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
}
