package com.pluralsight;

public class CellPhone
{
    // private variables
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // constructors
    public CellPhone()
    {
    }

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner)
    {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    // getters / setters
    public int getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getCarrier()
    {
        return carrier;
    }

    public void setCarrier(String carrier)
    {
        this.carrier = carrier;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    // methods
    public void dial(String phoneNumber)
    {
        System.out.printf("%s's phone is calling %s. \n", owner, phoneNumber);
    }

    public void dial(CellPhone phone)
    {
        dial(phone.getPhoneNumber());
    }
}

