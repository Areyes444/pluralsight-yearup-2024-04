package com.pluralsight;

public class Car
{
    private int vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    public Car(int vehicleId, String makeModel, String color, int odometerReading, double price)
    {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public int getVehicleId()
    {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel()
    {
        return makeModel;
    }

    public void setMakeModel(String makeModel)
    {
        this.makeModel = makeModel;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getOdometerReading()
    {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading)
    {
        this.odometerReading = odometerReading;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
