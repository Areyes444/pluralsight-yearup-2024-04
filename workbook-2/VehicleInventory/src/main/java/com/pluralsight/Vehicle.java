package com.pluralsight;

public class Vehicle
{
    private long vehicleId;
    private String makeModel;
    private String color;
    private Integer odometerReading;
    private double price;

    public Vehicle(long vehicleId, String makeModel, String color, Integer odometerReading, double price)
    {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public long getVehicleId()
    {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId)
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

    public Integer getOdometerReading()
    {
        return odometerReading;
    }

    public void setOdometerReading(Integer odometerReading)
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
